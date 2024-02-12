/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Navod Madusanka
 */
public class MultiMailSender implements Runnable{
    private Queue<Mail> queue = new PriorityQueue();
    
    public void sendMail(Mail mail){
        queue.offer(mail);
        synchronized (queue) {
            queue.notifyAll();
        }
    }
    
    public void strat(){
        Thread t = new Thread(this,"Mail_Sender-1");
        Thread t1 = new Thread(this,"Mail_Sender-2");
        Thread t2 = new Thread(this,"Mail_Sender-3");
        
        t.start();
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        while(true){
            System.out.println(Thread.currentThread().getName()+ "Checking new Mails....");
            if (!queue.isEmpty()) {
                Mail mail = queue.poll();
                System.out.println(Thread.currentThread().getName()+"Sending Mail ....");
                System.out.println(mail);
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                synchronized (queue) {
                    try {
                        System.out.println(Thread.currentThread().getName()+"Mail service waiting for Mail");
                        queue.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }
}
