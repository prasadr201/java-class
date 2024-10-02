//Map -> take input in 'pair' form (key, value)
/* Operation => O(1)
 * 1. put(key,value)   2. get(key)  3.containsKey(key) => (is present)   4.remove(key)
 */

//1.hash Map
//2. give output => unorderd
//3. Data Structure => LinkedList
//4. form of Array of LinkedList
import java.util.*;
public class _01HashMap{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("india",30);
        hm.put("china",56);
        hm.put("bhutan",48);
        hm.put("pak", 10);

        System.out.println(hm);
        System.out.println(hm.get("bhutan"));

        hm.remove("china");
        
        System.out.println(hm);

        System.out.println(hm.containsKey("india"));
        // hm.clear();
        
        // System.out.println(hm);


        //iteration
        //use => keySet
        Set<String> key = hm.keySet();
        System.out.println(key);

        //or
        Set<String> key1 = hm.keySet();
        for(String k: key1){
            // System.out.println(k);  Or for values 
            System.out.println(k + "  , value = " + hm.get(k));
            
        }


        //print with values => emptySet()
        

    }
}