/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navod.webapp.listner;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author Navod Madusanka
 */
//@WebListener
public class ContextAttributeListner implements ServletContextAttributeListener{

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("AttributeAdded..."+event.getName()+" = "+event.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("AttributeRemoved..."+event.getName()+" = "+event.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("AttributeReplaced..."+event.getName()+" = "+event.getValue());
    }
    
}
