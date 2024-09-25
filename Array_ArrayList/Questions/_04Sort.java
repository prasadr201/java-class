import java.util.*;
public class _04Sort{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(2);
        list.add(34);
        list.add(24);
        list.add(15);


        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        // Comparater  => type of functions -> logic defin
        System.out.println(list);
        
    }
}