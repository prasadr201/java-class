//all operation perfome on 'head'
import java.util.*;
public class _03LinkedList{

    //node class for linked list
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //stack class
    public static class Stack{
        static Node head = null;  // starting node will be null

        //is empty
        public static boolean isEmpty(){
            return head == null;  //ie head is empty
        }

        //push function
        public static void push(int data){
            Node newNode = new Node(data);

            //is ll is empty => O(1)
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop function => O(1)
        public static int pop(){
            //is ll is empty
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        //peek function => O(1)
        public static int peek(){
            //is ll is empty
            if(isEmpty()){
                return -1;
            }

            int top = head.data;
            return top;
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
        System.out.println();
    }
}