package com.li.springboot.controller;

import com.li.springboot.bean.Notice;
import com.li.springboot.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author lt
 * @version 1.0
 * @date 2019/12/16 11:08 下午
 */
@Controller
public class NoticeController {

    @Autowired
    NoticeMapper noticeMapper;

    @GetMapping("/notices")
    public String getAllNotice(Model model){
        Collection<Notice> notices = noticeMapper.getAllNotice();
        model.addAttribute("notices",notices);
        return "notice/list";
    }




}
