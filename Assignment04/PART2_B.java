import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayafarshad
 */
public class PART2_B {

    public static void main(String[] args) {
               
       List nameList = new ArrayList();
       nameList.add("Kyle");
       nameList.add("Cathy");
       nameList.add("Sam");
       nameList.add("Austin");
       nameList.add("Sara");      
       Iterator<String>nameIterator = nameList.iterator();
       
       System.out.println(nameList);       
       System.out.println(nameIterator.next());
       nameIterator.remove();
       System.out.println(nameIterator.next());
       System.out.println(nameIterator.next());
       nameIterator.remove();
       System.out.println(nameIterator.next());
       System.out.println(nameList);
       System.out.println(nameIterator.next());
       System.out.println(nameIterator.next());
       
       
    }    
}
