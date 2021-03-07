package cn.yifansun.controller;

import cn.yifansun.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    //    1、提交的域名称和处理方法的参数名一致
    @RequestMapping("/hello")
    public String hello(String name) {
        System.out.println(name);
        return "hello";
    }

    //    2、提交的域名称和处理方法的参数名不一致
    @RequestMapping("/commitName")
    public String commit(Model model, HttpServletRequest request, @RequestParam("username") String name) {
        //String name =request.getParameter("name");
        System.out.println(name);
        model.addAttribute("name", name);
        return "test";
    }

    //    3、提交的是一个对象
    //    如果使用对象的话，前端传递的参数名和对象名必须一致，否则就是null。
    @RequestMapping("/user")
    public String user(User user) {
        System.out.println(user);
        return "test";
    }
    @RequestMapping("toCommit")
    public String toCommit(){
        return "commit";
    }
}
