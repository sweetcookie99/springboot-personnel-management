package com.li.springboot.mapper;

import com.li.springboot.bean.Employee;
import com.li.springboot.bean.Job;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lt
 * @version 1.0
 * @date 2019/12/16 11:05 下午
 */
@Mapper
public interface EmployeeMapper {
    @Select("select count(id) from employee_inf")
    public int getCount();

    @Select("select * from employee_inf")
    public List<Employee> getAllEmployee();

    @Insert("insert into employee_inf(name,sex,phone,email,education,card_id,job_id,dept_id,create_date) values(#{name},#{sex},#{phone},#{email},#{education},#{cardId},#{jobId},#{deptId},#{createDate})")
    public int insertEmp(Employee employee);

    @Delete("delete from employee_inf where id = #{id}")
    public int deleteEmp(String id);

    @Select("select * from employee_inf where name LIKE CONCAT('%',#{name},'%')")
    public List<Employee> getEmpByName(String name);
}
