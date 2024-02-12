/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navod.webapp.listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author Navod Madusanka
 */
//@WebListener
public class MyServletRequestListener implements ServletRequestListener{

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("requestInitialized.....");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("requestDestroyd....");
    }
    
}
