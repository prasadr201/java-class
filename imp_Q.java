import java.util.*;
public class imp_Q{
    public static String removeNonAlphabetic(String s1) {
        if (s1 == null) {
            return null; // Handle null input
        }
        // Using replaceAll() to remove non-alphabetic characters
        return s1.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static boolean isPallindrom(String s){
        String s1 = s.toLowerCase();
        
        String s2 = removeNonAlphabetic(s1);
        StringBuilder s3 = new StringBuilder("");
        for(int i=s2.length()-1; i>=0; i--){
            s3.append(s2.charAt(i));
        }
        String s4 = new String(s3);
        if(s2.equals(s4)){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        String s = "race a car";
        System.out.println(isPallindrom(s));;
    }
}