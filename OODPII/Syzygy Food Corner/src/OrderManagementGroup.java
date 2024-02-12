interface CommunicationMediator{
    void sendMessage(String message, Colleague colleague);
}
class OrderManagementSystem implements CommunicationMediator{
    @Override
    public void sendMessage(String message, Colleague colleague) {
        colleague.receiveMessage(message);
    }
}
interface Colleague{
    void sendMessage(String message);
    void receiveMessage(String message);
}

class Customer implements Colleague{
    private final CommunicationMediator mediator;

    public Customer(CommunicationMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Customer received message: " + message);
    }
}
public class OrderManagementGroup implements Colleague {
    private final CommunicationMediator mediator;

    public OrderManagementGroup(CommunicationMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Order Management Group received message: " + message);
    }
}
