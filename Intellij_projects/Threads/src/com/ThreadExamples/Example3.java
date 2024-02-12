package com.ThreadExamples;

class X{
    private int count;
    void count(){
        System.out.println(Thread.currentThread().getName()+" : Counting...");
        count++;
    }
    int getCount(){
        return count;
    }
}

class Thread4 extends Thread{
    X x;
    public Thread4(X x){
        this.x = x;
    }

    @Override
    public void run() {
        synchronized (x){
            x.count();
            System.out.println(Thread.currentThread().getName()+" : "+x.getCount());
        }
    }
}

public class Example3 {
    public static void main(String[] args) {
        X x = new X();
        Thread4 mt = new Thread4(x);
        mt.start();
        synchronized (x){
            x.count();
            System.out.println(Thread.currentThread().getName()+" : "+x.getCount());
        }
    }
}
