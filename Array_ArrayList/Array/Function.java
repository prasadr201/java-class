import java.util.*;
public class Function{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        } 
        
       int max_val = Arrays.stream(a).min().getAsInt();
       System.out.println(max_val);
    }
}