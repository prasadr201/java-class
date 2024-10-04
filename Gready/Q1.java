//Select the max activities but at a time only one activity can done by a person
import java.util.*;
public class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s[] = {1,3,0,5,8,5};
        int e[] = {2,4,6,7,9,9};

        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
         //always select the first activity
         list.add(0);
         count = 1;
        
         int lastend = e[0];
         for(int i=1; i<s.length; i++){
            if(s[i] >= lastend){
                list.add(i);
                lastend = e[i];
                count++;
            }
         }

         System.out.println("max = " + count);
         System.out.println(list);
    }
}