package com.cyberaray.proxymanager.controller;

import com.cyberaray.proxymanager.service.IServiceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Deprecated
public class ServicesController {
    @Autowired
    private IServiceInfoService serviceInfoService;
}
