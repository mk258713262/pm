package com.cyberaray.proxymanager.controller;

import com.cyberaray.proxymanager.entity.ServiceV2ray;
import com.cyberaray.proxymanager.service.IServiceV2rayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


/**
 * V2Ray服务Controller
 * 
 * @author mok
 * @date 2020-06-16
 */
@Controller
public class ServiceV2rayController  {
    @Autowired
    private IServiceV2rayService serviceV2rayService;

    @RequestMapping(path = "/delV2rayInfo/{V2rayInfoId}" , method = RequestMethod.GET)
    public String delFFInfo(HttpServletRequest request, @PathVariable("V2rayInfoId")long V2rayInfoId){
        serviceV2rayService.deleteServiceV2rayById(V2rayInfoId);
        return "redirect:/index";
    }

    @RequestMapping(value="/detailV2rayInfo/{V2rayInfoId}",method = RequestMethod.GET)
    public String getFFDetail(HttpServletRequest request, Model model,
                              @PathVariable("V2rayInfoId")long V2rayInfoId) {
        ServiceV2ray ServiceV2rayInfo = serviceV2rayService.selectServiceV2rayById(V2rayInfoId);
        model.addAttribute("ServiceV2rayInfo", ServiceV2rayInfo);
        return "/info/V2rayInfo_detail";
    }

    @RequestMapping("/saveV2ray")
    public String saveUL(ServiceV2ray V2rayInfo){
        System.out.println(V2rayInfo.getId());
        if(V2rayInfo.getId() == null ){
            serviceV2rayService.insertServiceV2ray(V2rayInfo);
        }else{
            serviceV2rayService.updateServiceV2ray(V2rayInfo);
        }
        return "redirect:/index";
    }

    @RequestMapping(value="/addV2ray")
    public String addFFInfo(){
        return "/info/V2rayinfo_detail";
    }

}
