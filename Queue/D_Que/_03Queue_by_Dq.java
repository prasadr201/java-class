import java.util.*;
public class _03Queue_by_Dq{
    public static class Queue{
        static Deque<Integer> deque = new LinkedList<>();

        public boolean isEmpty(){
            return deque.isEmpty();
        }

        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }

            int top = deque.peekFirst();
            deque.removeFirst();
            return top;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }

            return deque.peekFirst();
        }


    }

    public static void main(String args[]){
        Queue s = new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.remove();
        }
    }
}