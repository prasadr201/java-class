// ListIterator is an interface in Java that provides a way to traverse a list in both forward and backward directions,
/*
 * Let's take a look at some of the methods of ListIterator and how they can be used:

* hasNext() and next(): These methods are used to traverse the list in the forward direction. hasNext() returns true if there are more elements in the list and next() returns the next element.

* hasPrevious() and previous(): These methods are used to traverse the list in the backward direction. hasPrevious() returns true if there are more elements in the list in the backward direction and previous() returns the previous element.

* add(Object o): This method adds an element to the list at the current position of the iterator.

* remove(): This method removes the last element returned by next() or previous() from the list.

* set(Object o): This method replaces the last element returned by next() or previous() with the specified element.
 */


 // Click on Submit to check the output
import java.util.*;

class Basic
{
	public static void main (String[] args)
	{
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        
        ListIterator<String> iterator = myList.listIterator();
        
        while(iterator.hasNext()) {
            String fruit = iterator.next();
            if(fruit.equals("Banana")) {
                iterator.remove();
            }
            if(fruit.equals("Orange")) {
                iterator.add("Grapefruit");
            }
            if(fruit.equals("Apple")) {
                iterator.set("Pear");
            }
        }
        
        while(iterator.hasPrevious()) {
            String fruit = iterator.previous();
            System.out.println(fruit);
        }
        
        iterator.add("Mango");
        
        System.out.println(myList);
	}
}