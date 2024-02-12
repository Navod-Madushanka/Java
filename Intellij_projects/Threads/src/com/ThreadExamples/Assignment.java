package com.ThreadExamples;

class Thread1 extends Thread{

    public synchronized void value(){

        for (int i = 0; i<=100; i++){
            System.out.print("Downloading: "+i+"%");
            try {
                Thread.sleep(10);
                System.out.print("\r");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void run() {
        value();
    }
}

public class Assignment {
    public static void main(String[] args) {
        Thread t = new Thread1();
        t.start();

    }
}
