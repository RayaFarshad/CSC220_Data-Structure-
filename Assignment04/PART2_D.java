import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rayafarshad
 */
public class PART2_D {

    
    public static void main(String[] args) {
        
        List nameList = new ArrayList();
        nameList.add("Kyle");
        nameList.add("Cathy");
        nameList.add("Sam");
        nameList.add("Austin");
        nameList.add("Sara");       
        ListIterator<String>nameIterator = nameList.listIterator();
        
        nameIterator.next();
        nameIterator.remove();
        nameIterator.next();
        System.out.println(nameIterator.next());
        System.out.println(nameIterator.previous());
        nameIterator.remove();
        System.out.println(nameIterator.next());
        nameIterator.next();
        nameIterator.set("brittany");
        System.out.println("Revised List: ");
        System.out.println(nameList);
        System.out.println(nameIterator.previous());
        System.out.println(nameIterator.next());
       
    }
    
}
