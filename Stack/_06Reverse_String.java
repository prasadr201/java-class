import java.util.*;
public class _06Reverse_String{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            s.push(str.charAt(i));
        } 

        while(!s.isEmpty()){
            System.out.print(s.peek());
            s.pop();
        }

        System.out.println();
    }
}