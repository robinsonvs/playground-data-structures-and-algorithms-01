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


    }
}