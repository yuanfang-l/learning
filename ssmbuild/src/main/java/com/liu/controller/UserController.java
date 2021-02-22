package com.liu.controller;


import com.liu.pojo.Books;
import com.liu.pojo.User;
import com.liu.service.BookService;
import com.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/login")
    public String queryUserByUserName(String username,String password, Model model){
        User user = userService.queryUserByUserName(username);
        if (user==null){

            model.addAttribute("tip","用户名不存在");
            return "login";

        }
        else {
            if (!password.equals(user.getPassword())){
                model.addAttribute("tip","密码错误");
                return "login";
            }
            List<Books> list = bookService.queryAllBook();
            model.addAttribute("list", list);
            return "allBook";
        }
    }
}
