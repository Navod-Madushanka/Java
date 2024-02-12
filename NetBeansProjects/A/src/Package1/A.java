
package Package1;

public class A{
	public static void main(String[]args){
		MyThread t = new MyThread();
		t.start();
		t.start(1);
	}
}

class MyThread extends Thread{
	public void run(){
		System.out.println("No Arguments");
	}
	publilc void run(int i){
		System.out.println("With Arguments");
	}
}

