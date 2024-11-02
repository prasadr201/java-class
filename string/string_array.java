import java.util.*;
import java.lang.*;
import java.io.*;

class string_array
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String a = sc.next();
		    String b = sc.next();
		    
		    char aa[] = a.toCharArray();
		    char bb[] = b.toCharArray();
		    Arrays.sort(aa);
		    Arrays.sort(bb);
		    String aaa = new String(aa);
		    String bbb = new String(bb);
		    
		    System.out.println((aaa.equals(bbb))?"YES":"NO");
		}

	}
}
