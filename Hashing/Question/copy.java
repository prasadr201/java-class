import java.util.*;
import java.lang.*;
import java.io.*;

class copy
{
    public static int total(ArrayList<Integer> a, ArrayList<Integer> b, int n){
        int count=0;
        
        Set<Integer> set1 = new TreeSet<>();  
        Set<Integer> set2 = new TreeSet<>();
        for(int i=0; i<a.size(); i++){
            set1.add(a.get(i));
        }
        
        for(int i=0; i<b.size(); i++){
            set2.add(b.get(i));
        }
        
        Set<Integer> intersectionSet = new HashSet<>(set1);  
        intersectionSet.retainAll(set2);  //intersection
        intersectionSet.addAll(set2);  //give the union

        
        return intersectionSet.size();
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    ArrayList<Integer> a = new ArrayList<>();
		    for(int i=0; i<n; i++){
		        a.add(sc.nextInt());
		    }
		    
		    ArrayList<Integer> b = new ArrayList<>();
		    for(int i=0; i<n; i++){
		        b.add(sc.nextInt());
		    }
		    
		    System.out.println(total(a,b,n));
		}

	}
}
