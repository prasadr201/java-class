import java.util.*;
public class _07Revese_Stack{

    //reverse string 
    public static void reverse(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverse(s);
        System.out.println(top);
    }

    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);

        reverse(s);
    }
}