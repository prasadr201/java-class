import java.util.*;
public class _02Max{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int max = list.get(0);
        for(int i=1; i<list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        System.out.println(max);


        //collection
        System.out.println(Collections.max(list));
    }
}