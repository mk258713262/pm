package com.cyberaray.proxymanager.controller;

import com.cyberaray.proxymanager.annotation.LoginRequired;
import com.cyberaray.proxymanager.util.PlatformConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController implements PlatformConstant {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(path = "/setting", method = RequestMethod.GET)
    @LoginRequired
    public String getSettingPage(){
        return "/site/setting";
    }
}
