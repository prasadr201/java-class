//Output  => sorted
//Data structure  => Red Black Tree
//O(log)

import java.util.*;
public class _03TreeMap{
    public static void main(String[] args) {
        TreeMap<String,Integer> thm = new TreeMap<>();
        thm.put("india", 25);
        thm.put("china", 30);
        thm.put("us", 55);
        thm.put("Bhutan",40);
        
        System.out.println(thm);
    }
}