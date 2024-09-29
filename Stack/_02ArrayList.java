import java.util.*;
public class _02ArrayList{

    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //is empty function
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push O(1)
        public static void push(int data){
            list.add(data);
        }

        //pop O(1)
        public static int pop(){

            //is stack is empty
            if(isEmpty()){
                return -1;
            }


            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek O(1)
        public static int peek(){
            //is stack is empty
            if(list.isEmpty()){
                return -1;
            }

            int top = list.get(list.size()-1);
            return top;
        }
    }

    public static void main(String[] args) {
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