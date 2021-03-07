package cn.yifansun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;

@Controller
public class ControllerTest4 {
    //映射访问路径
    @RequestMapping(value = "/commit/{p1}/{p2}",method = {RequestMethod.POST})
    public String index(@PathVariable int p1, @PathVariable int p2, Model model){
        //传统方式：http://localhost:8080/add?a=1&b=2
        //RestFul：http://localhost:8080/add/1/2
        //在Spring MVC中可以使用  @PathVariable 注解，让方法参数的值对应绑定到一个URI模板变量上。
        int result = p1+p2;
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果："+result);
        //返回视图位置
        return "test";
    }
//    @RequestMapping("/commitName/{user    name}")
    @RequestMapping("/commitName")
    public String commit(Model model,HttpServletRequest request, @RequestParam("username")  String name){
        //String name =request.getParameter("name");
        System.out.println(name);
        model.addAttribute("name",name);
        return "test";
    }
    @RequestMapping("/toCommitName")
    public String toCommit(){
        return "commit";
    }
}
