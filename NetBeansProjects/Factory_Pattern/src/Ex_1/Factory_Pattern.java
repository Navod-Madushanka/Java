/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_1;

/**
 *
 * @author Navod Madusanka
 */
public class Factory_Pattern {
    public static void main(String[] args) {
        Shape_Factory shape_Factory = new Shape_Factory();
        Shape shape = shape_Factory.getShape("rectangle");
        shape.drow();
    }
}
