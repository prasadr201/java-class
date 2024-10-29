/*You are given a large number 
N
N. You need to print the number 
N+1.

Note: The number is very large and it will not fit in standard integer data type. You have to take the input as String and then manipulate the digits to convert it to 
N + 1
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0){
		    StringBuilder n = new StringBuilder(sc.nextLine());
		    int i = n.length()-1;
		    while(i >= 0 && n.charAt(i) == '9'){
		        n.setCharAt(i, '0');
		        i--;
		    }
		    if(i>=0){
		        n.setCharAt(i, (char)(n.charAt(i) + 1));
		    }
		    else{
		        n.insert(0,'1');
		    }
		    System.out.println(n);
		}

	}
}
