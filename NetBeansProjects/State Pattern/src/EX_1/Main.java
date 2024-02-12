/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_1;

/**
 *
 * @author Navod Madusanka
 */

interface State{
	void ring();
}

class Meeting implements State{
	@Override
	public void ring(){
		System.out.println("Vibate...");
	}
}

class General implements State{
	@Override
	public void ring(){
		System.out.println("Normal Ring...");
	}
}

class Outdoor implements State{
	@Override
	public void ring(){
		System.out.println("Loud Ring...");
	}
}

class Context{
	State state;
	public Context(){
		state = new General();
	}
	public void changeState(State state){
		this.state = state;
	}
        public void alert(){
            state.ring();
        }
}

public class Main {
    public static void main(String[] args) {
        Context c = new Context();
        c.alert();
        c.changeState(new Meeting());
        c.alert();
    }
}
