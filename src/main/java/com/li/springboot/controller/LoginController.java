package com.li.springboot.controller;

import com.li.springboot.bean.User;
import com.li.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author lt
 * @version 1.0
 * @date 2019/12/16 8:59 上午
 */
@Controller
public class LoginController {
    @Autowired
    UserMapper userMapper;

    @PostMapping(value = "/user/login")
    public String Login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
         User user = userMapper.getUser(username,password);
        if (user!=null){
            //为了防止表单重复提交，就重定向到主页
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else{
            map.put("msg","登录名或密码错误");
            return "loginForm";
        }


    }
}
