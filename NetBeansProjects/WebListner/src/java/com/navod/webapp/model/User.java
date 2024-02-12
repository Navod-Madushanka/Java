/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navod.webapp.model;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 *
 * @author Navod Madusanka
 */
public class User implements HttpSessionBindingListener{
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("valueBound");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("valueUnbound");
    }
    
    
}
