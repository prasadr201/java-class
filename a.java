import java.util.*;
public class a{

    public static boolean isPalindrom(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(isPalindrom(s,0,s.length()-1) == true){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not a  palindrom");
        }
    }
}