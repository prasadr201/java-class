//how to reverse the string integer value
import java.util.*;

public class _01intCom {

    static String hack(String n) {
        
        // Write your code here.
        char[] a = n.toCharArray();
        Arrays.sort(a);
        StringBuilder b = new StringBuilder(new String(a));
        b.reverse();
        return b.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(hack(n));
    }
}
