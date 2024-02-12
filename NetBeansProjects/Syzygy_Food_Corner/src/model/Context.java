/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Navod Madusanka
 */
interface Expression{
    void interpret(Context context);
}
class CheeseExpression implements Expression{
    @Override
    public void interpret(Context context) {
        context.setOutput(context.getOutput()+" ExtraCheese");
    }
}
class Context{
    private String output = "";

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
