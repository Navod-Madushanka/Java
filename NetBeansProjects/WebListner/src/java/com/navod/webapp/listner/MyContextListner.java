/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navod.webapp.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author Navod Madusanka
 */
//@WebListener
public class MyContextListner implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ContextInitialized.....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ContextDistroyed....");
    }

}
