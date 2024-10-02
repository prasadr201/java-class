//Hash set => 
//1. unique value
//2. unorder
//3. null also aplicable
//4. impliment by hash map

import java.util.*;
public class _01HashSet{
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<>();
        hs.add("delhi");
        hs.add("hydrabad");
        hs.add("kalcuta");
        hs.add("chennai");
        hs.add("noida");

        System.out.println(hs);
        hs.remove("kalcuta");
        System.out.println(hs);
        System.out.println(hs.contains("kalcuta"));
        
        System.out.println(hs.contains("hydrabad"));


        //iterate
        //inhance for loop => for each loop
        for(String s : hs){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}