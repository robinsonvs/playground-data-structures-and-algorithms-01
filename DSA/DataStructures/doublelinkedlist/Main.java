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
        
    }


}
