package com.cyberaray.proxymanager.controller;

import com.cyberaray.proxymanager.entity.LinkInfo;
import com.cyberaray.proxymanager.service.ILinkInfoService;
import com.cyberaray.proxymanager.service.Impl.LinkInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LinkController {
    @Autowired
    private ILinkInfoService linkInfoService;

    @RequestMapping(path = "/delLinkInfo/{linkInfoId}" , method = RequestMethod.GET)
    public String delLinkInfo(HttpServletRequest request, @PathVariable("linkInfoId")long linkInfoId){
        linkInfoService.deleteLinkInfoById(linkInfoId);
        return "redirect:/index";
    }

    @RequestMapping(value="/detailLinkInfo/{linkInfoId}",method = RequestMethod.GET)
    public String getLinkDetail(HttpServletRequest request, Model model,
                                @PathVariable("linkInfoId")long linkInfoId) {
        LinkInfo linkInfo = linkInfoService.selectLinkInfoById(linkInfoId);
        model.addAttribute("linkInfo", linkInfo);
        return "/info/linkinfo_detail";
    }

    @RequestMapping("/saveLink")
    public String saveUL(LinkInfo linkInfo){
        System.out.println(linkInfo.getId());
        System.out.println(linkInfo.getLinkType());
        if(linkInfo.getId() == null ){
            linkInfoService.insertLinkInfo(linkInfo);
        }else{
            linkInfoService.updateLinkInfo(linkInfo);
        }
        return "redirect:/index";
    }

    @RequestMapping(value="/addLink")
    public String addLinkInfo(){
        return "/info/linkinfo_detail";
    }
}
