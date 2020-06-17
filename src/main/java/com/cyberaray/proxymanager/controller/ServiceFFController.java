package com.cyberaray.proxymanager.controller;

import java.util.List;

import com.cyberaray.proxymanager.entity.ServiceFF;
import com.cyberaray.proxymanager.service.IServiceFFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * ff服务Controller
 * 
 * @author mok
 * @date 2020-06-16
 */
@Controller
public class ServiceFFController
{
    @Autowired
    private IServiceFFService serviceFFService;

    @RequestMapping(path = "/delFFInfo/{FFInfoId}" , method = RequestMethod.GET)
    public String delFFInfo(HttpServletRequest request, @PathVariable("FFInfoId")long FFInfoId){
        serviceFFService.deleteServiceFFById(FFInfoId);
        return "redirect:/index";
    }

    @RequestMapping(value="/detailFFInfo/{FFInfoId}",method = RequestMethod.GET)
    public String getFFDetail(HttpServletRequest request, Model model,
                                @PathVariable("FFInfoId")long FFInfoId) {
        ServiceFF FFInfo = serviceFFService.selectServiceFFById(FFInfoId);
        model.addAttribute("FFInfo", FFInfo);
        return "/info/FFinfo_detail";
    }

    @RequestMapping("/saveFF")
    public String saveUL(ServiceFF FFInfo){
        System.out.println(FFInfo.getId());
        if(FFInfo.getId() == null ){
            serviceFFService.insertServiceFF(FFInfo);
        }else{
            serviceFFService.updateServiceFF(FFInfo);
        }
        return "redirect:/index";
    }

    @RequestMapping(value="/addFF")
    public String addFFInfo(){
        return "/info/FFinfo_detail";
    }
}
