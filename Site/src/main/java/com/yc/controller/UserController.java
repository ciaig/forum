package com.yc.controller;

import com.yc.domain.User;
import com.yc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("registe")
    public ModelAndView registe(User user){
        ModelAndView modelAndView = new ModelAndView();
        userService.registe(user);
        modelAndView.addObject("infoMsg","注册成功");
        modelAndView.setViewName("info");
        return modelAndView;
    }
    @RequestMapping("login")
    public String login(String uName, String uPassword, String remember, HttpSession session, HttpServletResponse response){
        User user=userService.login(uName,uPassword);
        session.setAttribute("isLogin",user);
        if(remember!=null){
            Cookie name = new Cookie("uName", uName);
            Cookie password = new Cookie("uPassword", uPassword);
            name.setMaxAge(604800);
            password.setMaxAge(604800);
            response.addCookie(name);
            response.addCookie(password);
        }
        return "redirect:usercenter";
    }
    @RequestMapping("/quit")
    public String quit(HttpSession session){
        session.setAttribute("isLogin",null);
        return "redirect:index";
    }
    @RequestMapping("/usercenter")
    public ModelAndView usercenter(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("usercenter");
        return modelAndView;
    }
    @RequestMapping("/updateinfo")
    public String updateinfo(User user, @RequestParam("img") CommonsMultipartFile img, HttpSession session, HttpServletRequest request) throws IOException {
        if(img.getSize()!=0){
            String contextPath = request.getSession().getServletContext().getRealPath("resources/headimg/");
            String fileName = img.getOriginalFilename();
            String suffix = fileName.substring(fileName.lastIndexOf("."));
            String newFileName= UUID.randomUUID().toString();
            File realfile=new File(contextPath + newFileName + suffix);
            img.transferTo(realfile);
            String oldHeadImg = user.getHeadImg();
            if(!"default.jpg".equals(oldHeadImg)){
                File oldrealfile=new File(contextPath + oldHeadImg + suffix);
                oldrealfile.delete();
            }
            user.setHeadImg(newFileName+suffix);
        }
        userService.update(user);
        User newUser = userService.getById(user.getuId());
        session.setAttribute("isLogin",newUser);
        return "redirect:usercenter";
    }
}
