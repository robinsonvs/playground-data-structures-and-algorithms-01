package DSA.DataStructures.doublelinkedlist;

public class Main {

    public static void main(String[] args) {
        
        DoubleLinkedList myDoubleLL = new DoubleLinkedList(7);
        myDoubleLL.getHead();
        myDoubleLL.getTail();
        myDoubleLL.getLength();
    
        myDoubleLL.printList();

        System.out.println("****** Append ***********");
        DoubleLinkedList myDoubleLLAppend = new DoubleLinkedList(1);

        myDoubleLLAppend.printList();        
        myDoubleLLAppend.append(2);
    
        myDoubleLLAppend.printList();        

        System.out.println("****** Remove Last ***********");
        DoubleLinkedList myDoubleLLRemoveLast = new DoubleLinkedList(1);
        myDoubleLLRemoveLast.append(2);
        myDoubleLLRemoveLast.append(3);
        myDoubleLLRemoveLast.printList();        

        // (2) items - returns 2 Node
        System.out.println(myDoubleLLRemoveLast.removeLast().value);
        // (1) items - returns 1 Node
        System.out.println(myDoubleLLRemoveLast.removeLast().value);
        // (0) items - returns null
        System.out.println(myDoubleLLRemoveLast.removeLast().value);
        

        System.out.println("****** Prepend ***********");
        DoubleLinkedList myDoubleLLPrepende = new DoubleLinkedList(2);
        myDoubleLLPrepende.append(3);
        myDoubleLLPrepende.printList();        

        myDoubleLLPrepende.prepend(1);
    
        myDoubleLLPrepende.printList();   


        System.out.println("****** Remove First ***********");
        DoubleLinkedList myDoubleLLRemoveFirst = new DoubleLinkedList(1);
        myDoubleLLRemoveFirst.append(2);
        myDoubleLLRemoveFirst.printList();        

        System.out.println(myDoubleLLRemoveFirst.removeFirst().value);
    
        myDoubleLLRemoveFirst.printList();           

        System.out.println("****** Get ***********");
        DoubleLinkedList myDoubleLLGet = new DoubleLinkedList(1);
        myDoubleLLGet.append(2);
        myDoubleLLGet.append(3);
        myDoubleLLGet.printList();        

        System.out.println(myDoubleLLGet.get(1).value);

        System.out.println("****** Set ***********");
        DoubleLinkedList myDoubleLLSet = new DoubleLinkedList(1);
        myDoubleLLSet.append(2);
        myDoubleLLSet.append(3);
        myDoubleLLSet.printList();        

        System.out.println(myDoubleLLSet.set(1, 6));
        myDoubleLLSet.printList();        
        
    }


}
