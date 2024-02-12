/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_1;

/**
 *
 * @author Navod Madusanka
 */
interface MobileState{
    public void alert(AlertContext context);
}

class MeetingState implements MobileState{

    @Override
    public void alert(AlertContext context) {
        System.out.println("Vibrate....");
    }
    
}

class GeneralState implements MobileState{

    @Override
    public void alert(AlertContext context) {
        System.out.println("Ringing....");
    }
    
}

class AlertContext{
    private MobileState currentState;
    
    public AlertContext(){
        currentState = new MeetingState();
    }
    
    public void setState(MobileState state){
        currentState = state;
    }
    
    public void alert(){
        currentState.alert(this);
    }
}

public class State_Pattern_demo {
    public static void main(String[] args) {
        AlertContext context = new AlertContext();
        context.alert();
        context.alert();
        context.alert();
        context.setState(new GeneralState());
        context.alert();
        context.alert();
        context.alert();
    }
}


