import java.util.*;
public class _01Reverse{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int i = list.size()-1;
        while(i>=0){
            System.out.print(list.get(i) + " ");
            i--;
        }
        System.out.println();

        //Collections
        Collections.reverse(list);
        System.out.println(list);
    }
}