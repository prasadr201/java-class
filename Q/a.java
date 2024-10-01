import java.util.*;
public class a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int state =0;
        for(int i=0; i<a.length; i++){
            int ip = a[i];
            switch(ip){
                case 0:
                state = (ip==1)?1:0;

                case 1:
                state = (ip==1)?2:0;
                

                case 2:
                state = (ip==1)?3:0;
                
                case3: 
                state = (ip == 1|| ip == 0)?3:0;
                
            }

           
        }
        System.out.println((state==3)?"accept":"reject");
    }
}