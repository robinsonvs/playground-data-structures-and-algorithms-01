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
        
    }


}
