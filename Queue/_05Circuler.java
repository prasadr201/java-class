import java.util.*;
public class _05Circuler{

    public static class Queue{
        static int a[];
        static int size;
        static int rear;
        static int front;

        public Queue(int n){
            a = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean  isEmpty(){
            return rear == -1 && front==-1;
        }

        public void add(int data){
            if((rear+1)%size == front){
                System.out.println("queue is full");
                return;
            }

            if(rear ==-1 && front ==-1){
                front = 0;
            }

            rear = (rear+1)%size;
            a[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            
            }
            int result = a[front];
            if(front == rear){
                front = rear = -1;
            }
            else{
                
            front = (front+1)%size;
            }


            
            
            return result;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }

            return a[front];
        }


    }

    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}