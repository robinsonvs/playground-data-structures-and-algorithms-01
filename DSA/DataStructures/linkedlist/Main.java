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
        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1
            Linked List:
            4
        */        

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
        /*
       		EXPECTED OUTPUT:
        	----------------
        	Head: 1
        	Tail: 2
        	Length: 2
        	Linked List:
        	1
        	2
     	*/        

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
        /*
        	EXPECTED OUTPUT:
        	----------------
        	2
        	1
        	null
     	*/

        //------------------------------------------------------

        LinkedList prependLinkedList = new LinkedList(2);
        prependLinkedList.append(3);

        System.out.println("Before prepend():");
        System.out.println("------------------");
        prependLinkedList.getHead();
        prependLinkedList.getTail();
        prependLinkedList.getLength();

        System.out.println("\nLinked list:");
        prependLinkedList.printList();

        prependLinkedList.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------------");
        prependLinkedList.getHead();
        prependLinkedList.getTail();
        prependLinkedList.getLength();

        System.out.println("\nLinked list:");
        prependLinkedList.printList();
        /*
            EXPECTED OUTPUT:
            Before prepend():
            -----------------
            Head: 2
            Tail: 3
            Length: 2
            Linked List:
            2
            3
            After prepend():
            ----------------
            Head: 1
            Tail: 3
            Length: 3
            Linked List:
            1
            2
            3
        */        

    }
}
