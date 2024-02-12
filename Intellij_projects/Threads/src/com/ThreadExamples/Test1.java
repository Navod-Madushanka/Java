package com.ThreadExamples;

class A1{
    public synchronized void x(){
        System.out.println("Hello");
        this.y();
    }
    public synchronized void y(){
        System.out.println("java");
    }
}

class MyThread1 extends Thread{
    A1 a1;
    public MyThread1(A1 a1){
        this.a1 = a1;
    }
    @Override
    public void run() {
        a1.x();
    }
}

public class Test1 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        Thread t1 = new MyThread1(a1);
        Thread t2 = new MyThread1(a1);
        t1.start();
        t2.start();
    }
}
