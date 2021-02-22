package com.liu.controller;

/*
使用RESTful操作资源︰可以通过不同的请求方式来实现不同的效果!如下:请求地址一样，但
是功能可以不同!

 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerTest2 {
   // @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    @GetMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable String b, Model model){
        //@PathVariable绑定URL模板
        String res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";

    }
    @PostMapping("/add/{a}/{b}")
    public String test3(@PathVariable int a, @PathVariable String b, Model model){
        //@PathVariable绑定URL模板
        String res = a+b;
        model.addAttribute("msg","结果2为"+res);
        return "test";

    }
}
