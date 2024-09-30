// for implemnt Queue ue 2 Stack 
//1.if fist stack => empty => push
//2.else pop all element in secound stack 
//3.add new element in 1st
//4.pop add from secound in first

import java.util.*;
public class _05Stack{

    public static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        //is empty function
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add function
        public static void add(int data){

            //if s1 is not empty transfer all elemtn in s2
            while(!s1.isEmpty()){   //O(n)
                s2.push(s1.pop());
            }

            //add new element in s1
            s1.push(data);

            //again take all elemnt in s1 from s1
            while(!s2.isEmpty()){   //O(n)
                s1.push(s2.pop());
            }
        }

        //remove function  O(1)
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("empty");
                return -1;
            }

            return s1.pop();
        }

        //peek element  O(1)
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("empty");
                return -1;
            }

            return s1.peek();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }

        System.out.println();
    }
}