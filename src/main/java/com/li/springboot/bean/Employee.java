package com.li.springboot.bean;

/**
 * @Author: LTWO
 * @Date: 2019/5/14 4:57
 * @Version 1.0
 *id | name | sex | phone | email | education | cred_id | job_id | dept_id | create_date |*/
public class Employee {
    private int id;
    private String name;
    private String sex;
    private String phone;
    private String email;
    private String education;
    private String cardId;
    private String jobId;
    private String deptId;
    private String createDate;
    public Employee(){

    }

    public Employee(String name, String sex, String phone,
                    String email, String education, String cardId,
                    String jobId, String deptId, String createDate) {
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.education = education;
        this.cardId = cardId;
        this.jobId = jobId;
        this.deptId = deptId;
        this.createDate = createDate;
    }

    public Employee(String name, String sex, String phone, String email, String education, String cardId, String jobId, String deptId) {
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.education = education;
        this.cardId = cardId;
        this.jobId = jobId;
        this.deptId = deptId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", cardId='" + cardId + '\'' +
                ", jobId='" + jobId + '\'' +
                ", deptId='" + deptId + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
