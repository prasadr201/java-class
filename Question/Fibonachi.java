//0 1 1 2 3 5 8  
//recurence relation => f(n) = f(n-1) + f(n-2)


/* normal recursive aproch  O(2^n) */
// import java.util.*;
// public class Fibonachi{

//     public static int fibonachi(int n){
//         //base case
//         if(n ==0 || n==1){
//             return n;
//         }

//         return fibonachi(n-1) + fibonachi(n-2);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the no = ");
//         int n = sc.nextInt();
//         System.out.println(fibonachi(n));
//     }
// }



/* Dp approch = O(n) */
import java.util.*;
public class Fibonachi{

    public static int fibonachi(int n, int fb[]){
        //base case
        if(n==0 || n==1){
            return n;
        }

        //use alread find value
        if(fb[n] != 0){
            return fb[n];
        }

        //if it is not found already so we have to find the value
        fb[n] = fibonachi(n-1, fb) + fibonachi(n-2, fb);

        return fb[n];
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no =");
        int n = sc.nextInt();

        //extra array for storing the value so we can use at the call and we don't have to find the fib for a no for every step repeadly
        int fb[] = new int[n+1];

        System.out.println(fibonachi(n,fb));
    }
}