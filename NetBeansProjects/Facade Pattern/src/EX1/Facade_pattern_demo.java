/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX1;

/**
 *
 * @author Navod Madusanka
 */

interface Shape{
    void draw();
    void paint();
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw : Square");
    }

    @Override
    public void paint() {
        System.out.println("Paint : Square");
    }
    
}

class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw : Triangle");
    }

    @Override
    public void paint() {
        System.out.println("Paint : Triangle");
    }
    
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Draw : Rectangle");
    }

    @Override
    public void paint() {
        System.out.println("Paint : Rectangle");
    }
    
}

class ShapeCreator{
    private final Shape square;
    private final Shape rectangle;
    private final Shape triangle;
    
    public ShapeCreator(){
        square = new Square();
        rectangle = new Rectangle();
        triangle = new Triangle();
    }
    
    public void drawSquare(){
        square.draw();
    }
    
    public void paintSquare(){
        square.paint();
    }
    
    public void drawRectangle(){
        rectangle.draw();
    }
    
    public void paintRectangle(){
        rectangle.paint();
    }
    
    public void drawTriangle(){
        triangle.draw();
    }
    
    public void paintTriangle(){
        triangle.paint();
    }
}

public class Facade_pattern_demo {
    public static void main(String[] args) {
        ShapeCreator creator = new ShapeCreator();
        creator.drawSquare();
        creator.paintSquare();
    }
}
