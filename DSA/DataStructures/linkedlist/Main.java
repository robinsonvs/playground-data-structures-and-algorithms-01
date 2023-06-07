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
        System.out.println();

        //------------------------------------------------------

        LinkedList removeLastLinkedList = new LinkedList(1);
        removeLastLinkedList.append(2);

        //(2)Items - returns 2 Node
        System.out.println(removeLastLinkedList.removeLast().value);        
        //(1)Item - returns 1 Node
        System.out.println(removeLastLinkedList.removeLast().value);        
        //(0)Item - returns null
        System.out.println(removeLastLinkedList.removeLast());        
        System.out.println();

        //------------------------------------------------------

    }
}
