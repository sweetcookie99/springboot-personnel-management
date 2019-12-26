package com.li.springboot.mapper;

import com.li.springboot.bean.Dept;
import com.li.springboot.bean.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lt
 * @version 1.0
 * @date 2019/12/16 10:23 上午
 */

@Mapper
public interface DeptMapper {


    @Select("select count(id) from dept_inf")
    public int getCount();

    @Select("select * from dept_inf")
    public List<Dept> getAllDept();

    @Insert("insert into dept_inf(id,name,remark) values(#{id},#{name},#{remark})")
    public int insertDept(Dept dept);

    @Delete("delete from dept_inf where id=#{id}")
    public int deleteDept(String id);


}
