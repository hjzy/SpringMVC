package cn.yifansun.controller;

import cn.yifansun.pojo.User;
import cn.yifansun.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class UserController {

    @RequestMapping("/json1")
    @ResponseBody
    public String json1() throws JsonProcessingException {
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("秦疆1号", 3, "男");
        //将我们的对象解析成为json格式
        //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便
        return mapper.writeValueAsString(user);
    }
    @RequestMapping("/json5")
    public String json5() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date);
    }


}
