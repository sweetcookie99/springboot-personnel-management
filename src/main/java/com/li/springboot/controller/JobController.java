package com.li.springboot.controller;
import com.li.springboot.bean.Dept;
import com.li.springboot.bean.Job;
import com.li.springboot.bean.User;
import com.li.springboot.mapper.DeptMapper;
import com.li.springboot.mapper.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

/**
 * @author lt
 * @version 1.0
 * @date 2019/12/16 7:58 下午
 */
@Controller
public class JobController {
    @Autowired
    JobMapper jobMapper;


    @Autowired
    DeptMapper deptMapper;

    @GetMapping("/jobs")
    public String getAllJob(
                            Model model){
        Collection<Job> jobs = jobMapper.getAllJob();

        model.addAttribute("jobs",jobs);

        int num = jobMapper.getCount();
        model.addAttribute("num",num);
        return "job/list";
    }

    //前往修改页面
    @GetMapping("/job/{id}")
    public String toEditPage(@PathVariable Integer id, Model model){
 //       User user = userMapper.getUserById(id);
 //       model.addAttribute("user",user);
        return "user/update";
    }

    //处理修改
    @PostMapping("/job/update")
    public String updateUser(User user){
        System.out.println(user);
 //       userMapper.updateUserById(user);
        return "redirect:/users";
    }

    //前往添加页面
    @GetMapping("/job")
    public String toAddPage(Model model){
        Collection<Dept> depts = deptMapper.getAllDept();

        model.addAttribute("depts",depts);
        return "job/add";
    }

    //处理添加请求
    @PostMapping("/job/add")
    public String addUser(Job job){

        jobMapper.insertJob(job);
        return "redirect:/jobs";
    }


    //删除管理员
    @PostMapping("/job/{id}")
    public String deleteUser(@PathVariable("id") String id){
        jobMapper.deleteJobById(id);
        return "redirect:/jobs";
    }

    //模糊查询用户
    @PostMapping("job/select")
    public String selectJobByName(@RequestParam(value = "name") String name, Model model){
        Collection<Job> jobs = jobMapper.getJobByName(name);
        model.addAttribute("jobs",jobs);
        return "job/list";
    }
}
