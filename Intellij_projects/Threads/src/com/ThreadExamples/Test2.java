package com.ThreadExamples;

class B{
    public synchronized void x(){
        for (int i = 0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+" : Hello");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void y(){
        for (int i = 0; i< 5; i++){
            System.out.println(Thread.currentThread().getName()+" : Java");
        }
    }
}

class MyThread2 extends Thread{
    B b;
    public MyThread2(B b){
        this.b = b;
    }

    @Override
    public void run() {
        b.x();
        b.y();
    }
}


public class Test2 {
    public static void main(String[] args) {
        B b = new B();
        MyThread2 mt1 = new MyThread2(b);
        MyThread2 mt2 = new MyThread2(b);
        mt1.start();
        mt2.start();
    }
}
