import java.util.*;
public class NotUse{
        public int getSecondLargest(int[] arr) {
            // Code Here
             Set<Integer> list = new TreeSet<>();
             
             for(int i=1; i<arr.length; i++){
                 
                list.add(arr[i]);
             }
             if(list.size()<2){
                return -1;
             }
             Iterator<Integer> a = list.descendingIterator();
             
             return descendingIterator.next();
        }

        public static void main(String[] args) {
            int[] arr = { 12, 35, 1, 10, 34, 1 };
            System.out.println(getSecondLargest(arr));
            

    
        }
}