package com.cyberaray.proxymanager.controller;

import com.cyberaray.proxymanager.entity.VpsInfo;
import com.cyberaray.proxymanager.service.IVpsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
@Controller
public class VpsController {
    @Autowired
    private IVpsInfoService vpsInfoService;

    @RequestMapping(path="/delVps/{vpsId}" , method = RequestMethod.GET)
    public String delVpsInfo(@PathVariable("vpsId")long vpsId){
        vpsInfoService.deleteVpsInfoById(vpsId);
        return "redirect:/index";
    }

    @RequestMapping(value="/detailVps/{vpsId}",method = RequestMethod.GET)
    public String getVpsDetail(HttpServletRequest request, Model model,
                               @PathVariable("vpsId")long vpsId) {
        VpsInfo vpsInfo = vpsInfoService.selectVpsInfoById(vpsId);
        model.addAttribute("vpsInfo", vpsInfo);
        return "/info/vps_detail";
    }

    @RequestMapping("/saveVps")
    public String saveUV(VpsInfo vpsInfo){
        System.out.println(vpsInfo.getId());
        System.out.println(vpsInfo.getName());
        if(vpsInfo.getId() == null){
            vpsInfoService.insertVpsInfo(vpsInfo);
        }else{
            vpsInfoService.updateVpsInfo(vpsInfo);
        }

        return "redirect:/index";
    }

    @RequestMapping(value="/addVps")
    public String addVpsInfo(){
        return "/info/vps_detail";
    }
}
