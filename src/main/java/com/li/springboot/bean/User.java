package com.li.springboot.bean;

public class User {
    //| id | loginname | username | create_date | password |
    private int id;
    private String loginname;
    private String username;
    private String create_date;
    private String password;

    public User() {
    }

    public User(int id, String loginname, String username, String create_date, String password) {
        this.id = id;
        this.loginname = loginname;
        this.username = username;
        this.create_date = create_date;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", username='" + username + '\'' +
                ", create_date='" + create_date + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
