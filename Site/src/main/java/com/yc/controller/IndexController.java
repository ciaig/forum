package com.yc.controller;

import com.yc.domain.ChildCategory;
import com.yc.domain.FatherCategory;
import com.yc.service.ChildService;
import com.yc.service.FatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private FatherService fatherService;
    @Autowired
    private ChildService childService;
    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        List<FatherCategory> fList=fatherService.getAll();
        for(FatherCategory fatherCategory:fList){
            List<ChildCategory> cList=childService.getByfId(fatherCategory.getfId());
            modelAndView.addObject("child"+fatherCategory.getfId(),cList);
        }
        modelAndView.addObject("father",fList);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
