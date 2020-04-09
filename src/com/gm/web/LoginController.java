package com.gm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(LoginController.BASE_CONTROLLER)
public class LoginController {
    //优化：字符串常量的提取
    public static final String BASE_CONTROLLER = "/loginController";
    public static final String INDEX_PAGE = "../index.jsp";


    //模拟登录
    //报错405 ： 用于表示请求方式不正确
    @RequestMapping(value = "/login",method = {RequestMethod.POST})
    public String login(){
        //1.服务器的处理
        System.out.println("正在登陆....       登录成功");
        //2.页面响应
        return INDEX_PAGE;
    }
}
