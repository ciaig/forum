package com.yc.controller;

import com.yc.domain.*;
import com.yc.service.ChildService;
import com.yc.service.PlateService;
import com.yc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PlateController {

    @Autowired
    private PlateService plateService;
    @Autowired
    private UserService userService;
    @Autowired
    private ChildService childService;
    @RequestMapping("/platelist")
    public ModelAndView platelist(Integer cateId){
        ModelAndView modelAndView = new ModelAndView();
        List<Plate> plates=plateService.getPlateListBycId(cateId);
        List<User> users =new ArrayList<>();
        for(Plate p:plates){
            User user = userService.getById(p.getUserId());
            users.add(user);
        }
        modelAndView.addObject("platelist",plates);
        modelAndView.addObject("userlist",users);
        modelAndView.setViewName("plate");
        return modelAndView;
    }
    @RequestMapping("/detial")
    public ModelAndView detial(Integer detialId){
        ModelAndView modelAndView = new ModelAndView();
        Detial detial=plateService.getDetialById(detialId);
        Plate plate=plateService.getPlateBypId(detial.getpId());
        User postuser = userService.getById(plate.getUserId());
        List<Discuss> discussList=plateService.getDiscussByPid(plate.getpId());
        List<DiscussInfo> discussInfos=new ArrayList<>();
        for(Discuss discuss:discussList){
            DiscussInfo discussInfo = new DiscussInfo();
            User user = userService.getById(discuss.getuId());
            discussInfo.setUser(user);
            discussInfo.setDiscuss(discuss);
            discussInfos.add(discussInfo);
        }
        modelAndView.addObject("detial",detial);
        modelAndView.addObject("postuser",postuser);
        modelAndView.addObject("plate",plate);
        modelAndView.addObject("discussinfos",discussInfos);
        modelAndView.setViewName("detial");
        return modelAndView;
    }
    @RequestMapping("/postdetial")
    public ModelAndView postdetial(){
        ModelAndView modelAndView = new ModelAndView();
        List<ChildCategory> categoryList=childService.getAllChild();
        modelAndView.addObject("categorylist",categoryList);
        modelAndView.setViewName("postdetial");
        return modelAndView;
    }
    @RequestMapping("/postplate")
    public ModelAndView postplate(Plate plate,String content){
        ModelAndView modelAndView = new ModelAndView();
        plateService.post(plate,content);
        modelAndView.addObject("infoMsg","发表成功");
        modelAndView.setViewName("info");
        return modelAndView;
    }
    @RequestMapping("/postdiscuss")
    public String postdiscuss(Discuss discuss){
        plateService.postDiscuss(discuss);
        return "redirect:detial?detialId="+discuss.getpId();
    }

    public final class DiscussInfo{
        private Discuss discuss;
        private User user;
        public DiscussInfo(){}
        public Discuss getDiscuss() {
            return discuss;
        }

        public void setDiscuss(Discuss discuss) {
            this.discuss = discuss;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    }
}
