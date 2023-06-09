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
        System.out.println();
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

        //------------------------------------------------------

        LinkedList removeFirstLinkedList = new LinkedList(2);
        removeFirstLinkedList.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(removeFirstLinkedList.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(removeFirstLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(removeFirstLinkedList.removeFirst());     
        System.out.println();
        /*
            EXPECTED OUTPUT:
            ----------------
            2
            1
            null
        */           
        //------------------------------------------------------


        LinkedList getLinkedList = new LinkedList(0);
        getLinkedList.append(1);
        getLinkedList.append(2);
        getLinkedList.append(3);

        System.out.println(getLinkedList.get(3).value);
        System.out.println();
        /*
            EXPECTED OUTPUT:
            ----------------
            3
        */

        //------------------------------------------------------

        LinkedList setLinkedList = new LinkedList(0);
        setLinkedList.append(1);
        setLinkedList.append(2);
        setLinkedList.append(3);

        System.out.println("Linked list before set():");
        setLinkedList.printList();
        
        setLinkedList.set(2, 99);

        System.out.println("\nLinked list after set():");
        setLinkedList.printList();
        /*
            EXPECTED OUTPUT:
            ----------------
            Linked List before set():
            0
            1
            2
            3
            
            Linked List after set():
            0
            1
            99
            3
        */       
        
        //------------------------------------------------------

        LinkedList insertLinkedList = new LinkedList(1);
        insertLinkedList.append(3);

        System.out.println("LL before insert():");
        insertLinkedList.printList();

        insertLinkedList.insert(1, 2);

        System.out.println("\nLL after insert(2) in niddle");
        insertLinkedList.printList();

        insertLinkedList.insert(0, 0);

        System.out.println("\nLL after insert(0) at beginning:");
        insertLinkedList.printList();

        insertLinkedList.insert(4, 4);

        System.out.println("\nLL after insert(4) at end:");
        insertLinkedList.printList();
        System.out.println();
        /*
            EXPECTED OUTPUT:
            ----------------
            LL before insert():
            1
            3

            LL after insert(2) in middle:
            1
            2
            3

            LL after insert(0) at beginning:
            0
            1
            2
            3

            LL after insert(4) at end:
            0
            1
            2
            3
            4
        */
        //------------------------------------------------------

        LinkedList removeLinkedList = new LinkedList(1);
        removeLinkedList.append(2);
        removeLinkedList.append(3);
        removeLinkedList.append(4);
        removeLinkedList.append(5);

        System.out.println("LL before remove():");
        removeLinkedList.printList();


        System.out.println("\nRemoved node:");
        System.out.println(removeLinkedList.remove(2).value);
        System.out.println("LL after remove() in middle:");
        removeLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(removeLinkedList.remove(0).value);
        System.out.println("LL after remove() of first node:");
        removeLinkedList.printList();        

        System.out.println("\nRemoved node:");
        System.out.println(removeLinkedList.remove(2).value);
        System.out.println("LL after remove() of last node:");
        removeLinkedList.printList();   
        System.out.println();             
        /*
            EXPECTED OUTPUT:
            ----------------
            LL before remove():
            1
            2
            3
            4
            5

            Removed node:
            3
            LL after remove() in middle:
            1
            2
            4
            5

            Removed node:
            1
            LL after remove() of first node:
            2
            4
            5

            Removed node:
            5
            LL after remove() of last node:
            2
            4
        */
        //------------------------------------------------------

        LinkedList reverseLinledList = new LinkedList(1);
        reverseLinledList.append(2);
        reverseLinledList.append(3);
        reverseLinledList.append(4);

        System.out.println("LL before reverse():");
        reverseLinledList.printList();

        reverseLinledList.reverse();

        System.out.println("\nLL after reverse():");
        reverseLinledList.printList();
        System.out.println();
        /*
            EXPECTED OUTPUT:
            ----------------
            LL before reverse():
            1
            2
            3
            4
            
            LL after reverse():
            4
            3
            2
            1
        */
        //------------------------------------------------------

    }
}
