package DSA.DataStructures.linkedlist;

public class MainTEMP {

    public static void main(String[] args) {
        LinkedListTEMP linkedList = new LinkedListTEMP(1);
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
        LinkedListTEMP linkedListRemoveFirst = new LinkedListTEMP(1);
        linkedListRemoveFirst.append(2);
        linkedListRemoveFirst.append(3);

        System.out.println(linkedListRemoveFirst.removeFirst().value);
        System.out.println(linkedListRemoveFirst.removeFirst().value);
        System.out.println(linkedListRemoveFirst.removeFirst().value);

        linkedListRemoveFirst.getLength();
        linkedListRemoveFirst.printList();  

        System.out.println("*****Get index******");
        LinkedListTEMP linkedListGet = new LinkedListTEMP(1);
        linkedListGet.append(2);
        linkedListGet.append(3);

        System.out.println(linkedListGet.get(1).value + "\n");

        linkedListGet.printList();          

        System.out.println("*****Set index******");
        LinkedListTEMP linkedListSet = new LinkedListTEMP(1);
        linkedListSet.append(2);
        linkedListSet.append(3);

        linkedListSet.printList();

        System.out.println(linkedListSet.set(1, 4));

        linkedListSet.printList();         
        
        
        System.out.println("*****Insert index******");
        LinkedListTEMP linkedListInsert = new LinkedListTEMP(1);
        linkedListInsert.append(2);
        linkedListInsert.append(3);

        linkedListInsert.printList();

        System.out.println(linkedListInsert.insert(3, 4));

        linkedListInsert.printList();     


        System.out.println("*****Remove index******");
        LinkedListTEMP linkedListRemoveIndex = new LinkedListTEMP(1);
        linkedListRemoveIndex.append(2);
        linkedListRemoveIndex.append(3);

        linkedListRemoveIndex.printList();

        System.out.println("**" + linkedListRemoveIndex.remove(1).value);

        linkedListRemoveIndex.printList();    


        System.out.println("*****Reverse******");
        LinkedListTEMP linkedListReverse = new LinkedListTEMP(1);
        linkedListReverse.append(2);
        linkedListReverse.append(3);
        linkedListReverse.append(4);

        linkedListReverse.printList();

        linkedListReverse.reverse();

        linkedListReverse.printList(); 

    }
}