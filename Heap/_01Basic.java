/* Heap => *Complieat Binary Tree, type=> max-heap, min-heap
 *         *Implement => Array, ArrayList (take O(1)->add), (tree take -> O(n+extra time for heapify))
 *         *Visualisation => 1.tree => show parent child relationship
 *                           2.ArrayList = > when perent given=>{(Left-child = 2*i+1, Right-child = 2*i+2)=> for '0' indexing}
 *                                          when child given and find parent { (x-1)/2 }
 */

import java.util.*;
public class _01Basic{

    public static class Heap{
        static ArrayList<Integer> list = new ArrayList<>();

    public void add(int data){
        list.add(data);

        int x = list.size()-1; // child index
        int par = (x-1)/2;

        while(list.get(x) < list.get(par)){
            int temp = list.get(x);
            list.set(x, list.get(par));
            list.set(par, temp);
            x = par;
            par = (x-1)/2;
        }
    }
    public static int peek(){
        return list.get(0);
    }
    
    private void heapify(int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int min = i;

        //if left is smaller then min index value
        if(left < list.size()-1 && list.get(left) < list.get(min)){
            min = left;
        }

        //if right is smaller than than the min index value
        if(right < list.size()-1 && list.get(right) < list.get(min)){
            min = right;
        }

        if(min != i){
            //swap ith and min value
            int temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, list.get(i));

            heapify(min);
        }
    }

    public int remove(){
        int data = list.get(0);

        //1.swap 1't and last value
        int temp = list.get(0);
        list.set(0,list.get(list.size()-1));
        list.set(list.size()-1, temp);

        //2. remove last index value
        list.remove(list.size()-1);

        //3. heapify
        heapify(0);
        return data;

    }

    public boolean isEmpty(){
        return list.size() == 0;
    }
}



    public static void main(String args[]){
        Heap h = new Heap();
        h.add(5);
        h.add(2);
        h.add(1);
        h.add(4);
        h.add(6);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }

    }
}