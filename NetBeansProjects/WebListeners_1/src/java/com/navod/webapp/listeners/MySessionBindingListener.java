/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navod.webapp.listeners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 *
 * @author Navod Madusanka
 */
@WebListener
public class MySessionBindingListener implements HttpSessionBindingListener{

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("valueBound....");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("valueUnbound.....");
    }
    
}
