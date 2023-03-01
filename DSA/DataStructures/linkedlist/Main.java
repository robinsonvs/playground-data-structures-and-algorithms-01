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

        System.out.println(linkedList.removeLast().toString());
        System.out.println(linkedList.removeLast().toString());
        System.out.println(linkedList.removeLast());

        linkedList.getLength();
        linkedList.printList();


    }
}