package Models;

public class LinkedList<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList(){
        this.head = null;
        this.tail = null;
        this.size= 0;

    }
    public void appendToTail(T value){
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public T findByValue(T value){
        Node<T> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) return current.getValue();
            current = current.getNext();
        }
        return null;


    }
    public boolean deleteByValue(T value) {
        if (head == null) return false;
        if (head.getValue().equals(value)) {
            head = head.getNext();
            size--;
            return true;
        }
        Node<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(value)) {
                current.setNext(current.getNext().getNext());
                size--;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    public void print() {
        Node<T> current = head;
        while(current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
