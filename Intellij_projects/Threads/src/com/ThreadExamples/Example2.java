package com.ThreadExamples;

public class Example2 extends Thread {
    int number;
    Object obj;
    public Example2(Object obj){
        this.obj = obj;
    }
    synchronized int m(int i){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return i*i;
    }

    @Override
    public void run() {
        System.out.println(getName()+" : Start");
        synchronized (obj){
            int i = m(this.number);
            System.out.println(getName()+" : Output = "+i);
        }
        System.out.println(getName()+" : End");
    }

    public static void main(String[] args) {
        Example2 t1 = new Example2(null);
        t1.number = 10;
        Example2 t2 = new Example2(null);
        t2.number = 20;
        t1.start();
        t2.start();
    }
}
