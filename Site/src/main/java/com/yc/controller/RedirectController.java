package com.yc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
    @RequestMapping("redirect_{url}")
    public String redirect(@PathVariable("url")String url){
        return url;
    }
}
