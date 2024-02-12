/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Navod Madusanka
 */
public class Mail_Sender extends Thread{
    
    private Queue<Mail> queue = new PriorityQueue();
    private boolean running;
    
    public void sendMail(Mail mail){
        queue.offer(mail);
        synchronized (queue) {
            queue.notifyAll();
        }
    }

    @Override
    public void run() {
        running = true;
        while(running){
            System.out.println("Checking new Mails....");
            if (!queue.isEmpty()) {
                Mail mail = queue.poll();
                System.out.println("Sending Mail ....");
                System.out.println(mail);
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                synchronized (queue) {
                    try {
                        System.out.println("Mail service waiting for Mail");
                        queue.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }
    
    public void terminate(){
        running = false;
    }
    
}
