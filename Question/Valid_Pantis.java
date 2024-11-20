import java.util.*;
public class Valid_Pantis{

    
    public static boolean valid(String str){
        if(str.length() == 0){
            return true;
        }

        Stack<Character> s = new Stack<>();
        int i=0;
        while(i < str.length()){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                else{
                    if((s.peek() == '(' && ch == ')') || (s.peek() == '[' && ch != ']') || (s.peek() == '{' && ch != '}') ){
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
            i++;
        }

        if(!s.isEmpty()){
            return false;
        }
        else{
            
        return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(valid(str));
    }
}