package com.ThreadExamples;

public class Example1 extends Thread{
    int number;
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
        System.out.println(getName()+" : start");
        int i =  m(this.number);
        System.out.println(getName()+" : Output= "+i);
        System.out.println(getName()+" : End");
    }

    public static void main(String[] args) {
        Example1 t1 = new Example1();
        t1.number = 10;
        Example1 t2 = new Example1();
        t2.number = 20;
        Example1 t3 = new Example1();
        t3.number = 30;
        t1.start();
        t2.start();
        t3.start();
    }
}
