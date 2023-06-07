package DSA.DataStructures.linkedlist;

public class Main {
    
    public static void main (String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked list:");
        myLinkedList.printList();
        System.out.println();

        //------------------------------------------------------

        LinkedList appendLinkedList = new LinkedList(1);
        appendLinkedList.makeEmpty();
        appendLinkedList.append(1);
        appendLinkedList.append(2);

        appendLinkedList.getHead();
        appendLinkedList.getTail();
        appendLinkedList.getLength();

        System.out.println("\nLinked list:");
        appendLinkedList.printList();
        
    }
}
