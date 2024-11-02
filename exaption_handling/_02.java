// Submit to check the output
import java.util.*;

class _02
{
	public static void main (String[] args)
	{
        try {
            // Attempt a risky operation
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println(result);
        }
        
        catch (ArithmeticException e) {
            // Catch the exception and handle it
            System.out.println("Oops, an error occurred: " + e.getMessage());
            //getMessage() is a method that can be called on an exception object to retrieve a message that describes the exception. 
  
        } 
        
        finally {
            // Execute code whether or not an exception was thrown
            System.out.println("This code will always execute!");
        }
	}
}