package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {
    @RequestMapping("t1")
    public String test(Model model){
        model.addAttribute("msg","test1");


        return "test";


    }
}
