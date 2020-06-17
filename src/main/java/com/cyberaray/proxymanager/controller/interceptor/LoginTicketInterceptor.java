package com.cyberaray.proxymanager.controller.interceptor;

import com.cyberaray.proxymanager.entity.LoginTicket;
import com.cyberaray.proxymanager.entity.User;
import com.cyberaray.proxymanager.service.UserService;
import com.cyberaray.proxymanager.util.CookieUtil;
import com.cyberaray.proxymanager.util.HostHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import sun.plugin.liveconnect.SecurityContextHelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Component
public class LoginTicketInterceptor implements HandlerInterceptor {

    @Autowired
    private HostHolder hostHolder;

    @Autowired
    private UserService userService;

    // 在Controller之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //从Cookie中拿到用户凭证，获得用户信息
        String ticket = CookieUtil.getValue(request,"ticket");
        if(ticket != null){
            //查询凭证
            LoginTicket loginTicket = userService.findLoginTicket(ticket);
            if(loginTicket != null && loginTicket.getStatus() == 0 && loginTicket.getExpired().after(new Date())){
                User user = userService.findUserById(loginTicket.getUserId());
                //持有用户
                hostHolder.setUser(user);
                // 构建用户认证的结果,并存入SecurityContext,以便于Security进行授权.
                Authentication authentication = new UsernamePasswordAuthenticationToken(
                        user,user.getPassword(),userService.getAuthorities(user.getId())
                );
                SecurityContextHolder.setContext(new SecurityContextImpl(authentication));
            }
        }
        return true;
    }

    // 在Controller之后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        User user = hostHolder.getUser();
        if(user != null && modelAndView != null){
            modelAndView.addObject("loginUser",user);
        }
    }
    // 在TemplateEngine之后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,  Exception ex) throws Exception {
        hostHolder.clear();
        SecurityContextHolder.clearContext();
    }


}
