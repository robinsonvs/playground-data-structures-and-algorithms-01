package DSA.DataStructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        System.out.println("***********");

        linkedList.append(2);

        linkedList.getLength();
        linkedList.printList();
    }
}