// Queue and DeQue => interface  (inpliment by ) => LinkedList Class
//Deque => 'add' and 'remove' by both rear and front

import java.util.*;
public class _01_Basics{
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);

        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        
        System.out.println(dq);
    }
}