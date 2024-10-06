//add and remove the data as per their priority
//add()  = O(log n)
//remove() = O(log n)
//peek()  = O(1)

import java.util.*;
public class _01Basic{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(4);
        pq.add(6);
        pq.add(1);
        pq.add(3);

        while(!pq.isEmpty()){
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
        System.out.println();
    }
}