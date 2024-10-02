//outpur -> in 'order' as per the input

import java.util.*;
public class _02LinkedHS{
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("delhi");
        lhs.add("hydrabad");
        lhs.add("kalcuta");
        lhs.add("chennai");
        lhs.add("noida");

        System.out.println(lhs);
        lhs.remove("kalcuta");
        System.out.println(lhs);
        System.out.println(lhs.contains("kalcuta"));
        
        System.out.println(lhs.contains("hydrabad"));

        //iteration
        for(String s : lhs){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}