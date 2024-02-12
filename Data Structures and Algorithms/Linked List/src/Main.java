

public class Main {
    public static void main(String[] args) {
        LinkedList mylinkedList = new LinkedList(1);
        mylinkedList.append(2);
        mylinkedList.append(3);
        mylinkedList.append(4);
        mylinkedList.printList();
        System.out.println("\n");
        mylinkedList.reverse();;
        mylinkedList.printList();
    }
}
