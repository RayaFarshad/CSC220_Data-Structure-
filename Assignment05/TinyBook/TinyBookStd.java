package TinyBook;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author rayafarshad
 */
public class TinyBookStd {

    public static void main(String[] args) {

        Multimap<String, String> tinyBook = ArrayListMultimap.create();

        //Adding some key/values
        System.out.println("\n-----DICTIONARY 220 Standard-----" + "\n\tpowered by Google Guava");
        tinyBook.put(Dictionary.book.name(), Dictionary.book.getStr1());
        tinyBook.put(Dictionary.book.name(), Dictionary.book.getStr2());
        tinyBook.put(Dictionary.bookable.name(), Dictionary.bookable.getStr1());
        tinyBook.put(Dictionary.bookbinder.name(), Dictionary.bookbinder.getStr1());
        tinyBook.put(Dictionary.bookcase.name(), Dictionary.bookcase.getStr1());
        tinyBook.put(Dictionary.csc220.name(), Dictionary.csc220.getStr1());
        tinyBook.put(Dictionary.csc220.name(), Dictionary.csc220.getStr2());
        tinyBook.put(Dictionary.csc220.name(), Dictionary.csc220.getStr3());

        boolean q = true;

        while (q) {
            System.out.print("Search: ");

            Scanner input = new Scanner(System.in);  // Reading from System.in
            String name = input.next();
            String myname = (String) name.toLowerCase();
            
            if (name.contains("!q")) {
                System.out.println("\n-----THANK YOU-----");
                q = false;
                return;
            }
            System.out.println("\t|");
             if (!(tinyBook.keySet().contains(myname))) {
                System.out.println("\t< NOT FOUND >");
                
            }
            
            for (Iterator keyIterator = tinyBook.keySet().iterator(); keyIterator.hasNext();) {

                String key = (String) keyIterator.next();
                List values = (List) tinyBook.get(key);

                if (key.equalsIgnoreCase(name)) {

                    for (ListIterator<String> li = values.listIterator(); li.hasNext();) {

                        System.out.println("\t" + key.toUpperCase().charAt(0) + key.substring(1, key.length()) + ": " + li.next());

                    }

                }

            }
            System.out.println("\t|");
        }
        
    }

}
