package com.handcoding.controller;

import com.handcoding.entity.User;
import com.handcoding.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public String login(){
        return "login";
    }


    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public String login(User user)
    {

        System.out.println(user.toString());
        return "redirect:/home";
    }

    @RequestMapping(value = "register",method = RequestMethod.GET)
    public String register(){
        return "register";
    }

    @RequestMapping(value = "register" ,method = RequestMethod.POST)
    public String register(User user)
    {
        userService.addUser(user);
        System.out.println(user.toString());
        return "redirect:/login";
    }

}
