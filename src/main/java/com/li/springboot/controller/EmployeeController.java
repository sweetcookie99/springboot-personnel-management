package com.li.springboot.controller;

import com.li.springboot.bean.Dept;
import com.li.springboot.bean.Employee;
import com.li.springboot.bean.Job;
import com.li.springboot.mapper.DeptMapper;
import com.li.springboot.mapper.EmployeeMapper;
import com.li.springboot.mapper.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

/**
 * @author lt
 * @version 1.0
 * @date 2019/12/16 11:08 下午
 */
@Controller
public class EmployeeController {

    @Autowired
    DeptMapper deptMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    JobMapper jobMapper;

    //显示雇员信息

    @GetMapping("/employees")
    public String getAllEmployee(Model model){
        Collection<Employee> employees = employeeMapper.getAllEmployee();
        model.addAttribute("employees",employees);
        return "employee/list";
    }

    //前往添加页面
    @GetMapping("/emp")
    public String toAddEmp(Model model){
        Collection<Dept> depts = deptMapper.getAllDept();
        Collection<Job> jobs = jobMapper.getAllJob();
        System.out.println(jobs);
        model.addAttribute("jobs",jobs);
        model.addAttribute("depts",depts);
        return "employee/add";
    }

    //添加员工
    @PostMapping("/emp/add")
    public String addEmp(Employee employee){
        System.out.println(employee);
        employeeMapper.insertEmp(employee);
        return "redirect:/employees";
    }

    //删除员工
    @PostMapping("/emp/{id}")
    public String deleteUser(@PathVariable("id") String id){
        employeeMapper.deleteEmp(id);
        return "redirect:/employees";
    }

    //查询员工
    @PostMapping("/emp/select")
    public String selectEmpByName(@RequestParam(value = "name") String name, Model model){
        Collection<Employee> employees = employeeMapper.getEmpByName(name);
        model.addAttribute("employees",employees);
        return "employee/list";
    }

}
