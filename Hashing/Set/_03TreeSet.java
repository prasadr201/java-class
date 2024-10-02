// Output => Sort 
//Null not allowed ( we cant compair the null with other at the sorting time)

import java.util.*;
public class _03TreeSet{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("hydrabad");
        ts.add("kalcuta");
        ts.add("chennai");
        ts.add("noida");

        System.out.println(ts);

        //iterate
        for(String s : ts){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}