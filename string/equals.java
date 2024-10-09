import java.util.*;
import java.lang.*;
import java.io.*;

class equals
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j=0; j<t; j++){
		    int n = sc.nextInt();
		    int a = 0, b=0;
		    String s = "START38";
		    String l = "LTIME108";
		    for(int i=0; i<n; i++){
		        String c = sc.next();
		        a += (c.equals(s))?1:0;
		        b += (c.equals(l))?1:0;
		    }
		    
		    System.out.println(a + " " + b);
		}

	}
}
