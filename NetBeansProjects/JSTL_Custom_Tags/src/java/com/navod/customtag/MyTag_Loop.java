/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navod.customtag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Navod Madusanka
 */
public class MyTag_Loop extends TagSupport{
    
    private Integer count = 0;
    private Integer start = 0;

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public int doStartTag() throws JspException {
        System.out.println("doStartTag....");
        start = 0;
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doAfterBody() throws JspException {
        System.out.println("doAfterBody");
        if(++start<count) {            
            return EVAL_BODY_AGAIN;
        }
        return SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        System.out.println("doEndTag");
        return SKIP_PAGE;
    }

}
