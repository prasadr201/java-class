import java.util.*;
public class _03LinkedList{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue{
        static Node head = null;
        static Node tail = null;

        //empty check function
        public static boolean isEmpty(){
            return head == null;
        }

        //add function
        public static void add(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        //remove function
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        //peek function
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }

        System.err.println();
    }
}