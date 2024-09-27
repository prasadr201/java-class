import java.util.*;
public class a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];
        for(int i=0; i<n ; i++){
            a[i] = sc.nextInt();
        }
        int b[] = new int[m];
        for(int i=0; i<m ; i++){
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i] == b[j]){
                    list.add(a[i]);
                    break;
                }
            }
        }

        // ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

       for(int i=0; i<list.size(); i++){
        System.out.print(list.get(i) + " ");
       }
        System.out.println();
    }
}

// 45 10
// 89 2 95 85 93 43 23 87 14 3 48 0 58 18 80 96 98 81 89 98 9 57 72 22 38 92 38 79 90 57 58 91 15 88 56 11 2 34 72 55 28 46 62 86 75 
// 33 69 42 44 16 81 98 22 51 21 