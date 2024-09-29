import java.util.*;
public class DecimalToB{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        while(n>0){
            s.push(n%2);
            n /= 2;
        }

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }

        System.out.println();
    }
}