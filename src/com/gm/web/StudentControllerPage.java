package com.gm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(StudentControllerPage.BASE_CONTROLLER)
public class StudentControllerPage {
    //字符串常量的提取
    public static final String BASE_CONTROLLER = "/studentControllerPage";
    public static final String INDEX_PAGE = "../index.jsp";

    //提供页面的响应跳转
    @RequestMapping("/addStu")
    public ModelAndView addStu(HttpServletRequest request, HttpServletResponse response){
        //服务器响应
        System.out.println("正在跳转页面......请等候......");


        try {
//            方式一：直接用ServletAPI实现页面跳转
//            request.getRequestDispatcher("../index.jsp").forward(request,response);
//            response.sendRedirect(request.getContextPath()+"/index.jsp");

            //方式二：可以根据字符串转发或重定向
            //区别在于路径是否发视改变
//            return "redirect:/index.jsp"; //注意：redirect 默认就是当前根目录请求资源
//            return "forward:../index.jsp";

            //方式三：直接响应ModelAndView ： 内部维护了页面
            ModelAndView mv = new ModelAndView();
            mv.setViewName("forward:../index.jsp");
            return mv;

            //方式四：直接页面字符串的地址    进行响应
//            return "forward:../index.jsp"; 和 return "index.jsp"

            //小结：二和四 是同一种响应方式，如果不指定响应方式，应该默认请求转发，也可以指定转发重定向
            //三是直接将响应的页面地址封装到ModelAndView,也可以去指定请求或者转发
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
