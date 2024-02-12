
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

    private String name;

    public Task(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i<10; i++ ){
            System.out.println(name+": Hello Thread Pool");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Main{
    public static void main(String[] args) {
       ExecutorService executor = Executors.newFixedThreadPool(5);
       executor.execute(new Task("Task 1"));
       executor.execute(new Task("Task 2"));
       executor.execute(new Task("Task 3"));
       executor.execute(new Task("Task 4"));
       executor.execute(new Task("Task 5"));
       executor.execute(new Task("Task 6"));
       executor.execute(new Task("Task 7"));

       executor.shutdown() ;

    }
}