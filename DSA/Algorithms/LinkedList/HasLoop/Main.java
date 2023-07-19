package DSA.Algorithms.LinkedList.HasLoop;

import DSA.Algorithms.LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {

        /*
         * In this problem, you should use the slow and fast pointer technique
         * (also know as Floy's Tortoise and Hare algorithm) to efficiently detect
         * the presence of a loop in the linkedlist.
         */
        
        LinkedList hasLoopLL = new LinkedList(1);
        hasLoopLL.append(2);
        hasLoopLL.append(3);
        hasLoopLL.append(4);
        hasLoopLL.append(5);

        boolean result = hasLoopLL.hasLoop(); //output : false
        System.out.println("Has loop: " + result);

        hasLoopLL.getHead().next.next.next = hasLoopLL.getHead().next;
        System.out.println("Create a loop...");

        result = hasLoopLL.hasLoop(); //output : false
        System.out.println("Has loop: " + result);



    }
    
}
