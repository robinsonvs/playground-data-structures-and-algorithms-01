package DSA.DataStructures.doublelinkedlist;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        private int value;
        private Node next;
        private Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoubleLinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }




    public void printlList() {
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
    
}
