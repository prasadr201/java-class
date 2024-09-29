import java.util.*;
public class _02Array{

    public static class Queue{
        static int a[];
        static int size;
        static int rear;

        public Queue(int n){
            a = new int[n];
            size = n;
            rear = -1;
        }

        //is empty
        public static boolean isEmpty(){
            return rear == -1;
        }

        //add function O(1)
        public static void add(int data){
            if(rear == size-1){
                System.out.println("full");
                return;
            }

            rear++;
            a[rear] = data;
        }

        //remove function O(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }

            int top = a[0];
            for(int i=0; i<size-1; i++){
                a[i] = a[i+1];
            }
            rear--;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            
            return a[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
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