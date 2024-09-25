/*
 * 1. add element      -> list.add(9)   => ArrayList_Name.add(value)
 *          or
 *                        list.add(2,4) => name.add(index,vlue);  in this the next values are shift by 1 index
 * 2. remove element   -> list.remove(1) => name.remove(index)
 * 3. get element      -> list.get(2) => name.get(index);
 * 4. set element      -> list.set(2,5) => name.set(indext,value) ; it only replace the value of that index
 * 5.contains          -> list .contains(4) => (value) ;   give true or false ie. value is present or not
 * 6. length           -> list.size();
 */

 import java.util.ArrayList;
 public class _02_Operations{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(2,7);

        System.out.println(list);
        
        list.remove(2);
        System.out.println(list);

        
        System.out.println(list.get(3));

        list.set(1,6);
        System.out.println(list);

        System.out.println(list.contains(1));
        System.out.println(list.contains(14));
        System.out.println(list.size());

    }
 }