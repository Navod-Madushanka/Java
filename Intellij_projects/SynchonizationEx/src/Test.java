import java.util.ArrayList;

class MyThread extends Thread{

    ArrayList al;

    public MyThread(ArrayList al){
        this.al = al;
    }

    @Override
    public void run() {
        while (true){
            System.out.println(al.toString());
                try {
                    synchronized (al){
                       al.wait();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}

public class Test {

    ArrayList al = new ArrayList();

    public static void main(String[] args) throws InterruptedException {

        Test t = new Test();

        MyThread mt = new MyThread(t.al);
        mt.start();

        for (int i = 0; i<10; i++){
            t.al.add(i);
            synchronized (t.al){
                t.al.notify();
            }
            Thread.sleep(1000);
        }
    }
}
