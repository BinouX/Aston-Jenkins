package com.geantcatcountry.geantcat.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HomepageController {

    @Value("${site.title}")
    private String message = "HelloWorld";

    @RequestMapping("/")
    public String showHomepage(Map<String, Object> model){
        model.put("titleSite", this.message);
        return "homepage";
    }
}
