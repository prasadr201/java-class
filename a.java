import java.util.*;
public class a{

    public static int factorial(int a){
        int fact = 1;
        while(a>0){
            fact *= a;
            a--;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(factorial(a));

    }
}