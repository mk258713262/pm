	package com.cyberaray.proxymanager.controller;

import com.cyberaray.proxymanager.annotation.LoginRequired;
import com.cyberaray.proxymanager.entity.LinkInfo;
import com.cyberaray.proxymanager.entity.ServiceInfo;
import com.cyberaray.proxymanager.entity.User;
import com.cyberaray.proxymanager.entity.VpsInfo;
import com.cyberaray.proxymanager.service.ILinkInfoService;
import com.cyberaray.proxymanager.service.IServiceInfoService;
import com.cyberaray.proxymanager.service.IVpsInfoService;

import com.cyberaray.proxymanager.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private IVpsInfoService vpsInfoService;
    @Autowired
    private ILinkInfoService linkInfoService;
    @Autowired
    private IServiceInfoService serviceInfoService;
    
    @LoginRequired
    @RequestMapping(path = "/index",method = RequestMethod.GET)
    public String getIndexPage(HttpServletRequest httpServletRequest, Model model )
    {
        List<User> userList = userService.selectUserInfoList();
        List<VpsInfo> vpsList = vpsInfoService.selectVpsInfoList(new VpsInfo());
        List<LinkInfo> linkList = linkInfoService.selectLinkInfoList(new LinkInfo());
        List<ServiceInfo> serviceList = serviceInfoService.selectServiceInfoList(new ServiceInfo());

        model.addAttribute("userList", userList);
        model.addAttribute("vpsList", vpsList);
        model.addAttribute("linkList", linkList);
        model.addAttribute("serviceList", serviceList);
        logger.info(userList.toString());
        return "/index";
    }
    @RequestMapping(path = "/error",method = RequestMethod.GET)
    public String getErrorPage(){return "/error/500";}

    @RequestMapping(path = "/denied",method = RequestMethod.GET)
    public String getDeninedPage(){return "/error/404";}
    
}
