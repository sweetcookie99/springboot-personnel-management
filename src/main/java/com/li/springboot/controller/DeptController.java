package com.li.springboot.controller;

import com.li.springboot.bean.Dept;
import com.li.springboot.bean.User;
import com.li.springboot.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

/**
 * @author lt
 * @version 1.0
 * @date 2019/12/16 11:07 下午
 */
@Controller
public class DeptController {

    @Autowired
    DeptMapper deptMapper;


    //显示所有部门信息
    @GetMapping("/depts")
    public String getAllDept(Model model){
         Collection<Dept> depts = deptMapper.getAllDept();
         model.addAttribute("depts",depts);
        return "dept/list";
    }

    //前往修改页面
    @GetMapping("/dept/{id}")
    public String toEditPage(@PathVariable Integer id, Model model){
      //  Dept dept = deptMapper.getUserById(id);
       // model.addAttribute("user",dept);
        return "dept/update";
    }

    //处理修改
    @PostMapping("/dept/update")
    public String updateUser(User user){
        System.out.println(user);
       // userMapper.updateUserById(user);
        return "redirect:/users";
    }

    //前往添加页面
    @GetMapping("/dept")
    public String toAddPage(){
        return "dept/add";
    }

    //处理添加请求
    @PostMapping("/dept/add")
    public String addUser(Dept dept){
        System.out.println(dept);
        deptMapper.insertDept(dept);
        return "redirect:/depts";
    }
    //处理删除
    @PostMapping("/dept/{id}")
    public String deleteDept(@PathVariable ("id") String id){
        deptMapper.deleteDept(id);
        return "redirect:/depts";
    }


}
