/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navod.customtag;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Navod Madusanka
 */
public class MyCalculater extends TagSupport {

    private Integer value;
    private Integer value2;
    private String var;
    private String scope;

    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setValue2(Integer value2) {
        this.value2 = value2;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        if (var != null && !var.isEmpty()) {
            int sc = pageContext.PAGE_SCOPE;
            switch (scope) {
                case "application":
                    sc = pageContext.APPLICATION_SCOPE;
                    break;
                case "session":
                    sc = pageContext.SESSION_SCOPE;
                    break;
                case "request":
                    sc = pageContext.REQUEST_SCOPE;
                    break;
            }
            
            pageContext.setAttribute(var, value * value2,sc);
        } else {
            try {
                out.print(value * value2);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        return SKIP_BODY;
    }

}
