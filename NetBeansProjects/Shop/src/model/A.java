/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Vector;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Navod Madusanka
 */
public class A {
    public static void main(String[] args) {
        try {
            JasperReport jr = JasperCompileManager.compileReport("src/reports/barcode.jrxml");
            
            HashMap parameters = new HashMap();
            
            Vector v = new Vector();
            v.add(new X("323212"));
            v.add(new X("546545"));
            v.add(new X("089765"));
            v.add(new X("342523"));
            
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(v);
            
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, dataSource);
            
            JasperViewer.viewReport(jp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

