package com.example.paneli.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @GetMapping("/login")
    public ModelAndView loginPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("loginandregister/login");
        return modelAndView;
    }

    @GetMapping("/loginToAllbookers")
    @ResponseBody
    public String index(){
        return "hello";
    }

    @RequestMapping(path="/in", method= RequestMethod.GET)
    public String goHome(){
        return "in";
    }
}
