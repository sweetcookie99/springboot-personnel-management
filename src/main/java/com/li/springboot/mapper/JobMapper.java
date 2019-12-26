package com.li.springboot.mapper;

import com.li.springboot.bean.Job;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author lt
 * @version 1.0
 * @date 2019/12/16 7:27 下午
 */
@Mapper
public interface JobMapper {
    @Select("select * from job_inf")
    public List<Job> getAllJob();

    @Delete("delete  from job_inf where id=#{id}")
    public int deleteJobById(String id);

    @Insert("insert into job_inf(id,dept_id,name,remark) values(#{id},#{deptId},#{name},#{remark})")
    public int insertJob(Job job);

    @Select("select count(id) from job_inf")
    public int getCount();

    @Select("select * from job_inf where name LIKE CONCAT('%',#{name},'%')")
    public List<Job> getJobByName(String name);
}
