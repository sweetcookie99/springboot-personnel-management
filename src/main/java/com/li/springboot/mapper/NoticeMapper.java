package com.li.springboot.mapper;

import com.li.springboot.bean.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lt
 * @version 1.0
 * @date 2019/12/16 11:05 下午
 */
@Mapper
public interface NoticeMapper {

    @Select("select * from notice_inf")
    public List<Notice> getAllNotice();

    @Select("select count(id) from use_inf")
    public int getCount();
}
