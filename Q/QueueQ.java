import java.util.*;
public class QueueQ{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        System.out.println("enter n = ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
            else{
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }

        System.out.println();
    }
}