/*
 * There are three types of errors in Java: syntax errors, runtime errors, and logical errors.

1. Syntax errors occur when the code doesn't follow the rules of the Java language.
2. Runtime errors occur during the execution of the program and can be caused by things like division by zero or trying to access an 
   element of an array that doesn't exist.
3. Logical errors occur when the program runs without any errors, but it doesn't produce the expected output.

**Exceptions, on the other hand, can be classified into two types: checked and unchecked exceptions.

1. Checked exceptions are those that the compiler knows might occur and requires the programmer to handle them using try-catch blocks.
2. Unchecked exceptions, on the other hand, are those that the compiler can't predict and don't require the programmer to handle them, 
   although it's still a good practice to do so.
 */


 /*
  * try-catch-finally
Java has some special keywords that can help us handle exceptions. These keywords are: try, catch, and finally.

1. "try" keyword is used to enclose a block of code that might throw an exception.
2. The "catch" keyword is used to catch the exception and handle it in a specific way.
3. finally, the "finally" keyword is used to execute code whether or not an exception was thrown.
  */


  // Submit to check the output
import java.util.*;

class _01 {
    public static void main(String[] args) {
        try {
            // Some code that might throw an exception
            String str = null;
            System.out.println(str.length());
        }
        catch (NumberFormatException e) {
            System.out.println("A number format exception occurred: " + e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println("A null pointer exception occurred: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}