import java.util.*;
public class _04JCF{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();  //Queue => interface => do not make its object => use LinkedList
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }

        System.out.println();
    }
}