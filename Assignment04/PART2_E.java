import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rayafarshad
 */
public class PART2_E {
   
    public static void main(String[] args) {        
        int pos =0;
        List nameList = new ArrayList();
        nameList.add("Kyle");
        nameList.add("Cathy");
        nameList.add("Sam");
        nameList.add("Austin");
        nameList.add("Sara");       
        ListIterator<String>nameIterator = nameList.listIterator();
        
             
         nameIterator.next();       
           for(int i = 0; i < nameList.size(); i++){ 
               if(nameIterator.hasNext()) {
               nameIterator.next(); 
               pos++;
                 if(nameList.get(i).equals("Sam")){
                  System.out.println(pos-1);                 
                  }                            
                }   
            }           
           nameList.add(pos-1, "Bob");
           System.out.println(nameList);
    }
}
