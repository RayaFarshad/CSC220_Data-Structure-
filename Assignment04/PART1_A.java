
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;
/*
 * @author rayafarshad
 */
public class PART1_A {

    public static void main(String[] args) {
        
        LinkedList myList = new LinkedList();
        
        myList.add("A");
        System.out.println(myList);
        myList.offer("B");
        System.out.println(myList);
        myList.offer("C");
        System.out.println(myList);
        myList.add("D");
        System.out.println(myList);
        myList.add(1,"one");
        System.out.println(myList);
        myList.add(1,"two");
        System.out.println(myList);
        myList.add(1,"three");
        System.out.println(myList);
        myList.add(1,"four");
        System.out.println(myList);
        myList.remove(myList.get(3));
        System.out.println(myList);
        myList.add(String.valueOf(myList.size()+4));
        System.out.println(myList);
        myList.set(4, myList.peekFirst());
        System.out.println(myList);
        myList.addFirst(myList.get(myList.size()-7));
        System.out.println(myList);
        myList.addFirst(myList.peekFirst());       
        System.out.println(myList);
        myList.add(String.valueOf(myList.indexOf(5)));    
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);
    }
    
}
