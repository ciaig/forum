package com.yc.controller;

import com.yc.domain.ChildCategory;
import com.yc.domain.FatherCategory;
import com.yc.domain.Plate;
import com.yc.domain.User;
import com.yc.service.ChildService;
import com.yc.service.FatherService;
import com.yc.service.PlateService;
import com.yc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private FatherService fatherService;
    @Autowired
    private ChildService childService;
    @Autowired
    private PlateService plateService;
    @Autowired
    private UserService userService;
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
    @RequestMapping("/overlook")
    public ModelAndView overlook(String order){
        ModelAndView modelAndView = new ModelAndView();
        List<Plate> plateList=null;
        List<User> users =new ArrayList<>();
        if("byTime".equals(order)){
            plateList=plateService.getPlateListOrderByTime();
            for(Plate p:plateList){
                User user = userService.getById(p.getUserId());
                users.add(user);
            }
        }else if("discuss".equals(order)){
            plateList=plateService.getPlateListOrderByDisscuss();
            for(Plate p:plateList){
                User user = userService.getById(p.getUserId());
                users.add(user);
            }
        }else{
            throw new RuntimeException("未知错误");
        }
        modelAndView.addObject("platelist",plateList);
        modelAndView.addObject("userlist",users);
        modelAndView.setViewName("overlook");
        return modelAndView;
    }
}
