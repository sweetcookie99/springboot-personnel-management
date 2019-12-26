package com.li.springboot;

import com.li.springboot.bean.Job;
import com.li.springboot.bean.User;
import com.li.springboot.mapper.JobMapper;
import com.li.springboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class SpringbootPersonnelManagementApplicationTests {

    @Autowired
    JobMapper userMapper;
    @Test
    void contextLoads() {
        ArrayList<Job> list = (ArrayList<Job>) userMapper.getJobByName("务");

        System.out.println(list);
    }

}
