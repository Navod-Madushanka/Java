package com.ThreadExamples;

class A{
    public void m(){
        System.out.println(Thread.currentThread().getName()+" : start");
        for(int i = 0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
        System.out.println(Thread.currentThread().getName()+" : Waiting....");
        synchronized (this){
            for (int i = 0; i<5; i++){
                System.out.println("out :"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println(Thread.currentThread().getName()+" : End");
    }
}

class MyThread extends Thread{
    A a;
    public MyThread(A a){
        this.a = a;
    }
    @Override
    public void run() {
        a.m();
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        MyThread mt1 = new MyThread(a);
        MyThread mt2 = new MyThread(a);
        MyThread mt3 = new MyThread(a);
        MyThread mt4 = new MyThread(a);
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();


    }
}
