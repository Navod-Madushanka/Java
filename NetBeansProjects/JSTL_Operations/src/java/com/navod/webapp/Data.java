/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navod.webapp;

import java.util.ListResourceBundle;

/**
 *
 * @author Navod Madusanka
 */
public class Data extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
        {"si.hello", "Navod"},
        {"en.hello", "Navod"}
    };

}
