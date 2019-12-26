package com.li.springboot.mapper;

import com.li.springboot.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author lt
 * @version 1.0
 * @date 2019/12/16 10:23 上午
 */
@Mapper
public interface UserMapper {

    @Select("select * from user_inf where loginname=#{username} and password=#{pwf}")
    public User getUser(String username,String pwf);

    @Select("select * from user_inf")
    public List<User>getAllUser();

    @Delete("delete from user_inf where id=#{id}")
    public int deletUserById(Integer id);

    @Select("select * from user_inf where id=#{id}")
    public User getUserById(Integer id);

    @Update("update user_inf set loginname=#{loginname},password=#{password},username=#{username} where id=#{id}")
    public int updateUserById(User user);

    @Insert("insert into user_inf(loginname,username,password,create_date) values(#{loginname},#{username},#{password},#{create_date})")
    public int inserteUserById(User user);

    @Select("select count(id) from use_inf")
    public int getCount();

    @Select("select * from user_inf where username=#{username}")
    public User getUserByName(String username);
}
