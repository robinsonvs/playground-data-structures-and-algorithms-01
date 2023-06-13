package DSA.Algorithms.LinkedList.FindMiddleNode;

import DSA.Algorithms.LinkedList.*;
import DSA.Algorithms.LinkedList.LinkedList.Node;

public class Main {

    /*
     * In this problem, you should use the slow and fast pointer technique 
     * (also known as Floyd's Tortoise and Hare algorithm) to find the middle 
     * element of the linked list efficiently.
     * The key idea is to have two pointers, one that moves twice as 
     * fast as the other. By the time the fast pointer reaches the end
     *  of the linked list, the slow pointer will be at the middle.
     */

    public static void main(String[] args) {
        
        LinkedList findMiddke = new LinkedList(1);
        findMiddke.append(2);
        findMiddke.append(3);
        findMiddke.append(4);
        findMiddke.append(5);
        Node middleNode = findMiddke.findMiddleNode();
        System.out.println(middleNode.value); //output: 3

        findMiddke.append(6);
        middleNode = findMiddke.findMiddleNode();
        System.out.println(middleNode.value); //output: 4
        
    }
}
