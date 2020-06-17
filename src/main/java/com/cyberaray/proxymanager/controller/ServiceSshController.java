package com.cyberaray.proxymanager.controller;

import com.cyberaray.proxymanager.entity.ServiceSsh;
import com.cyberaray.proxymanager.service.IServiceSshService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


/**
 * SSH服务Controller
 * 
 * @author mok
 * @date 2020-06-16
 */
@Controller

public class ServiceSshController {
    @Autowired
    private IServiceSshService serviceSshService;

    @RequestMapping(path = "/delSshInfo/{SshInfoId}" , method = RequestMethod.GET)
    public String delFFInfo(HttpServletRequest request, @PathVariable("SshInfoId")long SshInfoId){
        serviceSshService.deleteServiceSshById(SshInfoId);
        return "redirect:/index";
    }

    @RequestMapping(value="/detailSshInfo/{SshInfoId}",method = RequestMethod.GET)
    public String getFFDetail(HttpServletRequest request, Model model,
                              @PathVariable("SshInfoId")long SshInfoId) {
        ServiceSsh ServiceSshInfo = serviceSshService.selectServiceSshById(SshInfoId);
        model.addAttribute("ServiceSshInfo", ServiceSshInfo);
        return "/info/SshInfo_detail";
    }

    @RequestMapping("/saveSsh")
    public String saveUL(ServiceSsh SshInfo){
        System.out.println(SshInfo.getId());
        if(SshInfo.getId() == null ){
            serviceSshService.insertServiceSsh(SshInfo);
        }else{
            serviceSshService.updateServiceSsh(SshInfo);
        }
        return "redirect:/index";
    }

    @RequestMapping(value="/addSsh")
    public String addFFInfo(){
        return "/info/FFinfo_detail";
    }

}
