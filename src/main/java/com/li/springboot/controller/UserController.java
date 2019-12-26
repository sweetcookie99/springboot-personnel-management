package com.li.springboot.controller;

import com.li.springboot.bean.User;
import com.li.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author lt
 * @version 1.0
 * @date 2019/12/16 11:07 上午
 */
@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;

    //显示管理员信息
    @GetMapping("/users")
    public String list(Model model){
        Collection<User> users = userMapper.getAllUser();
        model.addAttribute("users",users);
        return "user/list";
    }
    //前往修改页面
    @GetMapping("/user/{id}")
    public String toEditPage(@PathVariable Integer id,Model model){
        User user = userMapper.getUserById(id);
        model.addAttribute("user",user);
        return "user/update";
    }

    //处理修改
    @PostMapping("/user/update")
    public String updateUser(User user){
        System.out.println(user);
        userMapper.updateUserById(user);
        return "redirect:/users";
    }

    //前往添加页面
    @GetMapping("/user")
    public String toAddPage(){
        return "user/add";
    }

    //处理添加请求
    @PostMapping("/user/add")
    public String addUser(User user){
        userMapper.inserteUserById(user);
        return "redirect:/users";
    }


    //删除管理员
    @PostMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        userMapper.deletUserById(id);
        return "redirect:/users";
    }

    //查询管理员
    @PostMapping("/user/select")
    public String selectPage(@RequestParam(value = "name") String name,Model model){
        User user = userMapper.getUserByName(name);
        model.addAttribute("user",user);
        return "user/list";
    }


}
