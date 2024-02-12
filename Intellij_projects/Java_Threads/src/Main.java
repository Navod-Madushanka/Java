
class Runnable_Child implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello");
    }
}


class MyThread extends Thread{
    MyThread (Runnable runnable){
        super(runnable);
    }
}


public class Main {
    public static void main(String[] args) {
        MyThread mt = new MyThread(new Runnable_Child());
        mt.start();
    }
}








