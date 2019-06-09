import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rayafarshad
 */
public class PART2_C {

    
    public static void main(String[] args) {
        List nameList = new ArrayList();
        nameList.add("Kyle");
        nameList.add("Cathy");
        nameList.add("Sam");
        nameList.add("Austin");
        nameList.add("Sara");
        ListIterator<String>nameIterator = nameList.listIterator();
        
        System.out.println(nameIterator.next());
        nameIterator.next();
        nameIterator.next();
        System.out.println(nameIterator.next());
       // nameIterator.set("Brittany");
        System.out.println(nameList);
        nameIterator.previous();
        nameIterator.remove();
        System.out.println(nameIterator.next());
        System.out.println(nameList);
        
    }
    
}
