package DSA.DataStructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        System.out.println("*****Append******");

        linkedList.append(2);

        linkedList.getLength();
        linkedList.printList();

        System.out.println("****Remove last*******");

        System.out.println(linkedList.removeLast().value);
        System.out.println(linkedList.removeLast().value);
        System.out.println(linkedList.removeLast());

        linkedList.getLength();
        linkedList.printList();

        System.out.println("*****Prepend******");
        linkedList.append(2);
        linkedList.append(3);

        linkedList.prepend(1);

        linkedList.getLength();
        linkedList.printList();        


        System.out.println("*****Remove first******");
        LinkedList linkedListRemoveFirst = new LinkedList(1);
        linkedListRemoveFirst.append(2);
        linkedListRemoveFirst.append(3);

        System.out.println(linkedListRemoveFirst.removeFirst().value);
        System.out.println(linkedListRemoveFirst.removeFirst().value);
        System.out.println(linkedListRemoveFirst.removeFirst().value);

        linkedListRemoveFirst.getLength();
        linkedListRemoveFirst.printList();  

        System.out.println("*****Get index******");
        LinkedList linkedListGet = new LinkedList(1);
        linkedListGet.append(2);
        linkedListGet.append(3);

        System.out.println(linkedListGet.get(1).value + "\n");

        linkedListGet.printList();          

        System.out.println("*****Set index******");
        LinkedList linkedListSet = new LinkedList(1);
        linkedListSet.append(2);
        linkedListSet.append(3);

        linkedListSet.printList();

        System.out.println(linkedListSet.set(1, 4));

        linkedListSet.printList();         
        
        
        System.out.println("*****Insert index******");
        LinkedList linkedListInsert = new LinkedList(1);
        linkedListInsert.append(2);
        linkedListInsert.append(3);

        linkedListInsert.printList();

        System.out.println(linkedListInsert.insert(3, 4));

        linkedListInsert.printList();     


        System.out.println("*****Remove index******");
        LinkedList linkedListRemoveIndex = new LinkedList(1);
        linkedListRemoveIndex.append(2);
        linkedListRemoveIndex.append(3);

        linkedListRemoveIndex.printList();

        System.out.println("**" + linkedListRemoveIndex.remove(1).value);

        linkedListRemoveIndex.printList();    

    }
}