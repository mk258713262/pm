package com.cyberaray.proxymanager.controller;

import com.cyberaray.proxymanager.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DataController {

    @Autowired
    DataService dataService;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date today = new Date();

    //统计页面
    @RequestMapping(path = "/data",method = {RequestMethod.GET,RequestMethod.POST})
    public String getDataPage(Model model){
        model.addAttribute("uvStartDate",today);
        model.addAttribute("uvEndDate",today);
        model.addAttribute("dauStartDate",today);
        model.addAttribute("dauEndDate",today);
        return "/site/admin/data";
    }

    @RequestMapping(path = "/data/uv",method = {RequestMethod.GET,RequestMethod.POST})
    public String getUV(@DateTimeFormat(pattern = "yyyy-MM-dd") Date start,
                        @DateTimeFormat(pattern = "yyyy-MM-dd") Date end,
                        Model model){
        long uv = dataService.calculateUV(start,end);
        model.addAttribute("uvResult",uv);
        model.addAttribute("uvStartDate",start);
        model.addAttribute("uvEndDate",end);
        return "forward:/data";
    }

    @RequestMapping(path = "/data/dau",method = {RequestMethod.GET,RequestMethod.POST})
    public String getDAU(@DateTimeFormat(pattern = "yyyy-MM-dd") Date start,
                         @DateTimeFormat(pattern = "yyyy-MM-dd") Date end,
                         Model model){
        long dau = dataService.calculateDAU(start,end);
        model.addAttribute("dauResult",dau);
        model.addAttribute("dauStartDate",start);
        model.addAttribute("dauEndDate",end);
        return "forward:/data";
    }
}
