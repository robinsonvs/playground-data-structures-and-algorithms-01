package DSA.DataStructures.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void getHead() {
        System.out.println(this.head == null ? "Head: null" : "Head: " + this.head.value);;
    }

    public void getTail() {
        System.out.println(this.tail == null ? "Tail: null" : "Tail: " + this.tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + this.length);
    }

    public void printList() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    
}
