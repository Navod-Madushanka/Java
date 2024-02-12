/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navod.webapp.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author Navod Madusanka
 */
//@WebListener
public class MyServletContextAttributeListener implements ServletContextAttributeListener{

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("attributeAdded.....");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("attributeRemoved....");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("attributeReplaced....");
    }
    
}
