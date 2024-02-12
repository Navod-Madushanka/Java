class MyThread extends Thread{

    public MyThread(ThreadGroup group, String name){
        super(group,name);
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        ThreadGroup main = Thread.currentThread().getThreadGroup();

        MyThread t1 = new MyThread(main,"A");
        MyThread t2 = new MyThread(main,"B");
        MyThread t3 = new MyThread(main,"C");
        MyThread t4 = new MyThread(main,"D");

        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);
        t4.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println(main.isDaemon());
    }
}