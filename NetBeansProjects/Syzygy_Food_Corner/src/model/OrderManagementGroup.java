/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Navod Madusanka
 */
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
