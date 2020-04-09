package com.gm.web;

import com.gm.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(StudentControllerPage2.BASE_CONTROLLER)
public class StudentControllerPage2 {
    //字符串常量的提取
    public static final String BASE_CONTROLLER = "/studentControllerPage2";
    public static final String INDEX_PAGE = "../index.jsp";

    @RequestMapping("/getData")
    public String  getData(@ModelAttribute("sex") Integer sex,HttpServletRequest request, HttpServletResponse response, Model m, ModelMap map,
                           @ModelAttribute("stu1") Student stu1){

        //1.直接借用ServletAPI实现模拟数据响应
//        request.setAttribute("name1","沈煜程猪皮1");
//        request.getSession().setAttribute("name2","沈煜程猪皮2");

        //2.借助ModelAndView对象实现数据响应
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName(INDEX_PAGE);
//        mv.addObject("s1",new Student(1,"杜润泽奥里给","18"));

        //3.借用Model和ModelMap来实现响应 可以理解为ModelAndView 拆分过来的
        m.addAttribute("name3","小花");
        map.addAttribute("name4","托儿所");
        map.put("name5","小学僧");

        //4.借用注解：@ModelAttribute实现响应数据
        //方法形参的响应方式:引用数据可以实现，但是基本类型只能响应我们原本的参数
        stu1.setId(2);
        stu1.setStuName("卡莎");

        sex = 18;

        return INDEX_PAGE;
    }

    //5.数据响应:通过返回值直接响应数据到客户端无需响应视图
    //406报错:(Not Acceptable):服务端错误，表示去响应数据的时候，格式无法正常转换
    @RequestMapping("/getData2")
    @ResponseBody
    public String getData(){
        // 如果是针对当前客户端的ajax请求，需要给与数据响应
        //1.直接响应字符串，传中文乱码
//        return "Java And Python,java是世界上最好的语言";
        //2.直接响应引用对象
//        Student stu1 = new Student(1,"疾风剑豪","害塞给");
//        return stu1;
        //3.直接响应集合
//        Student stu1 = new Student(2,"隔壁老杜","18");
//        Student stu2 = new Student(3,"隔壁老沈","18");
//        Student stu3 = new Student(4,"小陈哥哥","18");
//        List list = new ArrayList();
//        list.add(stu1);
//        list.add(stu2);
//        list.add(stu3);
//        return list;
        //4.直接响应JSON字符串
        String jsonStr ="{\"id\":2,\"stuName\":\"隔壁老沈\",\"age\":\"20\"}";
        return jsonStr;
    }
}
