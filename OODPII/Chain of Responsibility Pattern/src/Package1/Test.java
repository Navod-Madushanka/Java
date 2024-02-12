package Package1;

abstract class Handler{
    protected Handler handler;
    public void setHandler(Handler handler) {
        this.handler = handler;
    }
    public abstract void process(Client client);
}

class Handler1 extends Handler{
    @Override
    public void process(Client client){
        if(client.i==0){
            System.out.println("Error-A");
        }else{
            handler.process(client);
        }
    }
}
class Handler2 extends Handler{
    @Override
    public void process(Client client){
        if(client.i%2==0){
            handler.process(client);
        }else{
            System.out.println("Error-B");
        }
   }
}
class Handler3 extends Handler{
    @Override
    public void process(Client client){
        if(client.i%5==0){
            System.out.println("Success");
        }else{
            System.out.println("Error-C");
        }
    }
}
class Client{
    int i;
    public Client(int i){
        this.i = i;
    }
}

public class Test {
    public static void main(String[] args) {
        Client client = new Client(10);
        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        Handler3 handler3 = new Handler3();

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        handler1.process(client);
    }
}
