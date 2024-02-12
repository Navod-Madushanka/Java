/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EX_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Navod Madusanka
 */
class ResponseHandler1 implements Observer{
    private String resp;
    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof String){
            resp = (String)arg;
            System.out.println("\nReceived Notification: "+resp);
        }
    }
}

class ResponseHandler2 implements Observer{
    private String resp;
    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof String){
            resp = (String)arg;
            System.out.println("\nReceived Notification: "+resp);
        }
    }
}

class EventSource extends Observable implements Runnable{
    @Override
    public void run() {
        try {
            final InputStreamReader isr = new InputStreamReader(System.in);
            final BufferedReader br = new BufferedReader(isr);
            while(true){
                String response = br.readLine();
                setChanged();
                notifyObservers();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   
}

public class Observer_Demo {
    public static void main(String[] args) {
        System.out.println("Add text >");
        final EventSource eventsource = new EventSource();
        final ResponseHandler1 responseHandler1 = new ResponseHandler1();
        eventsource.addObserver(responseHandler1);
        final ResponseHandler2 responseHandler2 = new ResponseHandler2();
        eventsource.addObserver(responseHandler2);
        Thread t = new Thread(eventsource);
        t.start();
        
    }
}
