package DSA.Algorithms.LinkedList.FindKthFromEnd;

import DSA.Algorithms.LinkedList.LinkedList;
import DSA.Algorithms.LinkedList.LinkedList.Node;

public class Main {

    public static void main(String[] args) {
        
        /*
         * In this problem, you should use two-pointer technique
         * to efficiently find the k-th node from the end
         * of the linkedlist.
         */

         LinkedList findKthFromEndList = new LinkedList(1);
         findKthFromEndList.append(2);
         findKthFromEndList.append(3);
         findKthFromEndList.append(4);
         findKthFromEndList.append(5);

         Node result = findKthFromEndList.findKthFromEnd(2); //Output: Node with value 4
         System.out.println("Result when k is 2: " + result.value);

         result = findKthFromEndList.findKthFromEnd(5); //Output: Node with value 1
         System.out.println("Result when k is 5: " + result.value);

         result = findKthFromEndList.findKthFromEnd(6); //Output: null
         System.out.println("Result when k is 6: " + result);
    }
    
}
