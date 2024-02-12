/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navod.bankapp;

/**
 *
 * @author Navod Madusanka
 */
public class User {
    
    private String name;
    private String mobile;
    private String email;
    private String address;
    private String birthday;
    private String account_no;
    private String password;

    public User() {
    }
    
    

    public User(String name, String mobile, String email, String address, String birthday, String account_no, String password) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
        this.birthday = birthday;
        this.account_no = account_no;
        this.password = password;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
