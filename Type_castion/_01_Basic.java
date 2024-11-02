// Implicit(Widening Casting) - converting a smaller type to a larger type size
// Explicit(Narrowing Casting) - converting a larger type to a smaller size type

// Submit to check the output
import java.util.*;
public class _01_Basic
{
	public static void main (String[] args)
	{
		double myDouble1 = 3.14159265358979323846;
        float myFloat1 = (float) myDouble1;
        System.out.println(myFloat1);
        
        double myDouble2 = 9223372036854775807.0;
        long myLong2 = (long) myDouble2;
        System.out.println(myLong2);
        
        double myDouble3 = 9223372036854775807.0;
        long myLong3 = Math.round(myDouble3);
        System.out.println(myLong3);
	}
}