//type - Premitive                  |      Non-Primitive
        // 1. already present.         | 1. use with the help of Premitive
        // 2. int, float, chat,boolean | 2. String , Integer , float
        //                             |    they are basicaly a class



//How to take input of char
// char c = sc.next().charAt(0);

// //String convert to int
// parseint();
//int firstNumber = Integer.parseInt(firstNumberStr);

// Update the '_' to solve the problem
import java.util.*;

class _01_Datatype {

    //find a specific pricision value in the double
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        double area = 0;
        double pi = 3.14159265359;
        switch(ch){
            case 1:
            area= pi*a[0]*a[0];
            break;
            case 2:
            area =  a[0]*a[1];
            break;
        }        return Double.parseDouble(String.format("%.5f", area));
    }



    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Read decimal string input from user
        String decimalString = read.nextLine();
        
        // Convert decimal string to double
        double decimalValue = Double.parseDouble(decimalString);
        // Round the double value to the nearest integer
        int roundedValue = (int) Math.round(decimalValue);
        // Convert the rounded integer value to a string
        String roundedString = String.valueOf(roundedValue);

        System.out.println("Original String: " + decimalString);
        System.out.println("Rounded Value: " + roundedString);
    }
}