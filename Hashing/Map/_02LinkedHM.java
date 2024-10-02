//outpur => Order as per the input
//Data Strunctur => Doubly Linked List
//O(1)

import java.util.*;
public class _02LinkedHM{
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("india", 25);
        lhm.put("china", 30);
        lhm.put("us", 55);
        lhm.put("Bhutan",40);
        
        System.out.println(lhm);
    }
}