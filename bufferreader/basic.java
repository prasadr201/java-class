//use to take input from user
//here BufferReader => give string value always , & 'ascai value'
// use InputStreamReader = > take input from user and then store in the bufferReader
// import class => import java.io.*

import java.util.*;
import java.io.*;
public class basic{
    public static void main(String args[]) throws IOException {
        InputStreamReader io = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(io);

        String s = br.readLine();
        System.out.println(s);

        // int a = br.read(); // it will give the 'asci value'
        // System.out.println(a);

        //for print the integer value use "parseInteger"
        int number = Integer.parseInt(br.readLine());
        System.out.println(number);


        //for double value
        double num2 = Double.parseDouble(br.readLine());
        System.out.println(num2);

        //float value
        float value = Float.parseFloat(br.readLine());
        System.out.println(value);
    }
}