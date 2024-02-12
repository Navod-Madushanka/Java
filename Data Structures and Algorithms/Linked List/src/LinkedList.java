public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value){
        Node node = new Node(value);
        if(length == 0){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public Node removeLast(){
        Node temp = head;
        Node pre = head;
        if(length == 0) {
            return null;
        }else{
            while(temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            pre.next = null;
            length--;
            if(length == 0){
                head = null;
                tail = null;
            }
            return temp;
        }
    }

    public void prepend(int value){
        Node node = new Node(value);
        if(length == 0){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head = node;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0){
            return null;
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            if(length == 0){
                tail = null;
            }
            return temp;
        }
    }

    public Node get(int index){
        if(index < 0 || index > length){
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length){
            return false;
        } else if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            append(value);
            return true;
        }else{
            Node node = new Node(value);
            Node temp = get(index-1);
            node.next = temp.next;
            temp.next = node;
            length++;
            return true;
        }
    }

    public Node remove(int index){
        if(index < 0 || index > length){
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        }else{
            Node pre = get(index - 1);
            Node temp = pre.next;
            pre.next = temp.next;
            temp.next = null;
            length--;
            return temp;
        }
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }
}
