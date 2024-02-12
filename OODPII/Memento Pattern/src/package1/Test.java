package package1;

import java.util.Stack;

class A_Memento{
    private final int x;

    public A_Memento(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class CareTaker{
    private Stack<A_Memento> aStack = new Stack<>();
    public void addMemento(A_Memento aMemento){
        aStack.push(aMemento);
    }
    public A_Memento getMemento(){
        if(aStack.empty()){
            System.out.println("Cannot undo");
            return null;
        }else{
            return aStack.pop();
        }
    }
}

class A{
    private int x;
    private CareTaker careTaker = new CareTaker();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        A_Memento aMemento = new A_Memento(this.x);
        careTaker.addMemento(aMemento);
        this.x = x;
    }

    public void undo(){
        A_Memento memento = careTaker.getMemento();
        if(a_last!=null){
            this.x = a_last.getX();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.setX(10);
        System.out.println(a.getX());
        a.setX(50);
        System.out.println(a.getX());
        a.setX(25);
        System.out.println(a.getX());
        a.undo();
        System.out.println(a.getX());
        a.undo();
        System.out.println(a.getX());
    }
}
