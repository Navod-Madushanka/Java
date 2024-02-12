/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navod.webapp.listeners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author Navod Madusanka
 */
//@WebListener
public class MyServletRequestAttributeListener implements ServletRequestAttributeListener{

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("attributeAdded....");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("attributeRemoved....");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("attributeReplaced.....");
    }
    
}
