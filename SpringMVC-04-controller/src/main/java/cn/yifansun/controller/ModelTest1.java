package cn.yifansun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
/*通过SpringMVC来实现转发和重定向 - 无需视图解析器；

        测试前，需要将视图解析器注释掉*/
public class ModelTest1 {
    @RequestMapping("/rsm/t1")
    public String test1() {
        //转发一
        return "/index.jsp";
    }

    @RequestMapping("/rsm/t2")
    public String test2() {
        //转发二
        return "forward:/index.jsp";
    }

    @RequestMapping("/rsm/t3")
    public String test3() {
        //重定向
        return "redirect:/index.jsp";
    }
}