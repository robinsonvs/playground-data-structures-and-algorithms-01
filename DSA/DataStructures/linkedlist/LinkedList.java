package DSA.DataStructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }


    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }


    public void getHead() {
        System.out.println(head.value);
    }

    public void getTail() {
        System.out.println(tail.value);
    }

    public void getLength() {
        System.out.println(length);
    }


}