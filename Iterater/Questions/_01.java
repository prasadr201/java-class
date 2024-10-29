/*
 * Write a program to do the following

* Create an ArrayList and add the items Apple, Banana, Orange, Mango
* Remove the first and last elements of the list using ListIterator
* Print the items of the updated list using for-each loop

 */

 // Update the '_' to solve the problem
import java.util.*;

class _01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        // Create a ListIterator
        ListIterator<String> iterator = list.listIterator();

        // Remove the first element
        if (iterator.hasNext()) {
            iterator.next(); // Move to the first element
            iterator.remove(); // Remove the first element
        }

        // Remove the last element
        if (iterator.hasNext()) {
            // Check if there is at least one more element in the list
            while (iterator.hasNext()) {
                iterator.next(); // Move the iterator to the next element
            }
            iterator.remove(); // Remove the last element
        }

        System.out.print("Updated list: ");
        for (String element : list ){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
