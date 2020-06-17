package com.cyberaray.proxymanager.controller;

import com.cyberaray.proxymanager.entity.ServiceFF;
import com.cyberaray.proxymanager.entity.ServiceShadowsocks;
import com.cyberaray.proxymanager.service.IServiceFFService;
import com.cyberaray.proxymanager.service.IServiceShadowsocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * shadowsocks服务Controller
 * 
 * @author MOK
 * @date 2020-06-16
 */
@RestController
@RequestMapping("/system/shadowsocks")
public class ServiceShadowsocksController{
        @Autowired
        private IServiceShadowsocksService serviceShadowsocksService;

        @RequestMapping(path = "/delShadowsocksInfo/{ShadowsocksInfoId}" , method = RequestMethod.GET)
        public String delFFInfo(HttpServletRequest request, @PathVariable("ShadowsocksInfoId")long ShadowsocksInfoId){
            serviceShadowsocksService.deleteServiceShadowsocksById(ShadowsocksInfoId);
            return "redirect:/index";
        }

        @RequestMapping(value="/detailShadowsocksInfo/{ShadowsocksInfoId}",method = RequestMethod.GET)
        public String getFFDetail(HttpServletRequest request, Model model,
                                  @PathVariable("ShadowsocksInfoId")long ShadowsocksInfoId) {
            ServiceShadowsocks ServiceShadowsocksInfo = serviceShadowsocksService.selectServiceShadowsocksById(ShadowsocksInfoId);
            model.addAttribute("ServiceShadowsocksInfo", ServiceShadowsocksInfo);
            return "/info/ShadowsocksInfo_detail";
        }

        @RequestMapping("/saveShadowsocks")
        public String saveUL(ServiceShadowsocks ShadowsocksInfo){
            System.out.println(ShadowsocksInfo.getId());
            if(ShadowsocksInfo.getId() == null ){
                serviceShadowsocksService.insertServiceShadowsocks(ShadowsocksInfo);
            }else{
                serviceShadowsocksService.updateServiceShadowsocks(ShadowsocksInfo);
            }
            return "redirect:/index";
        }

        @RequestMapping(value="/addFF")
        public String addFFInfo(){
            return "/info/FFinfo_detail";
        }

}