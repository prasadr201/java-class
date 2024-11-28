import java.util.*;
public class _01uniqe{
   public static int total(String s){
      Map<Character,Integer> hm = new HashMap<>();
      int count = 1;
      hm.put(s.charAt(0), count);
      for(int i=1; i<s.length(); i++){
         if(hm.containsKey(s.charAt(i))){
            count++;
         }
         else{
            count = 1;
         }
         hm.put(s.charAt(i), count);
      }

      int i=0;
      
      while(i<s.length()){
         if(hm.get(s.charAt(i)) == 1) {
            return i; 
         }
         i++;
      }

      return -1;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      
      System.out.println(total(s));
   }
}