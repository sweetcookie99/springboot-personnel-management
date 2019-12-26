package com.li.springboot.bean;

/**
 * 这是一个公告
 * @Author: LTWO
 * @Date: 2019/5/14 5:09
 * @Version 1.0
 *| id | title | context | create_date | user_id |*/
public class Notice {
    private int id;
    private String title;
    private String context;
    private String createDate;
    private String userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
