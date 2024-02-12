/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;


import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 *
 * @author Navod Madusanka
 */
public class Run {
    public static void main(String[] args) {
        try {
            LookAndFeel laf = new SyntheticaBlackMoonLookAndFeel();
            UIManager.setLookAndFeel(laf);
            new Home().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
