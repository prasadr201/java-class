//Syntex = ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//ie we can add more than two list in other list

/*Q. -> merge two list*/
import java.util.*;
public class _03MultiDAL{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //list 1
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //list 2
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        list.add(list1);
        list.add(list2);

        // System.out.println(list);

        //print the values
        for(int i=0; i<list.size(); i++){
            ArrayList<Integer> currList = list.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}