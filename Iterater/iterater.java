// We already learned iterator allows you to access the elements of a collection one by one. Now, let's talk about the methods of the Iterator interface in Java. The Iterator interface has several methods that allow you to manipulate the elements of a collection. These methods are:

// hasNext() - This method returns true if the collection has more elements to iterate over.

// next() - This method returns the next element in the collection.

// remove() - This method removes the last element returned by the iterator from the collection.

import java.util.*;
public class iterater{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}