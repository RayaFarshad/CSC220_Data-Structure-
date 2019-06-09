/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinyBook;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author rayafarshad
 */
public class MyTinyBookPro {

    private final String itemPartOfSpeech;
    private final String definition;

    public MyTinyBookPro(String itemPartOfSpeech, String definition) {
        this.definition = definition;
        this.itemPartOfSpeech = itemPartOfSpeech;
    }

    /**
     * @return the itemDefinition
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * @return the itemPartOfSpeech
     */
    public String getItemPartOfSpeech() {
        return itemPartOfSpeech;
    }

    public static void main(String[] args) {

        Multimap<String, MyTinyBookPro> options = ArrayListMultimap.create();

        System.out.println("-----DICTIONARY 220 PRO-----\n\tpowered by Google Guava");
        MyTinyBookPro keyBookNoun = new MyTinyBookPro("noun", Dictionary.book.getStr1());
        MyTinyBookPro keyBookVerb = new MyTinyBookPro("verb", Dictionary.book.getStr2());
        MyTinyBookPro keyBookableAdj = new MyTinyBookPro("adjective", Dictionary.bookable.getStr1());
        MyTinyBookPro keyBookbinderAdj = new MyTinyBookPro("adjective", Dictionary.bookbinder.getStr1());
        MyTinyBookPro keyBookcaseNoun = new MyTinyBookPro("noun", Dictionary.bookcase.getStr1());
        MyTinyBookPro keyCsc220Noun = new MyTinyBookPro("noun", Dictionary.csc220.getStr1());
        MyTinyBookPro keyCsc220Verb = new MyTinyBookPro("verb", Dictionary.csc220.getStr3());
        MyTinyBookPro keyCsc220Adj = new MyTinyBookPro("adjective", Dictionary.csc220.getStr2());

        options.put(Dictionary.book.name(), keyBookNoun);
        options.put(Dictionary.book.name(), keyBookVerb);
        options.put(Dictionary.bookable.name(), keyBookableAdj);
        options.put(Dictionary.bookbinder.name(), keyBookbinderAdj);
        options.put(Dictionary.bookcase.name(), keyBookcaseNoun);
        options.put(Dictionary.csc220.name(), keyCsc220Noun);
        options.put(Dictionary.csc220.name(), keyCsc220Verb);
        options.put(Dictionary.csc220.name(), keyCsc220Adj);

        boolean s = true;
        while (s) {

            System.out.print("Search: ");

            Scanner inp = new Scanner(System.in);
            String myinp1 = (String) inp.next();
            String myinp2 = (String) inp.nextLine().trim();
            

            if (myinp1.contentEquals("!Q")) {
                System.out.println("\n-----THANK YOU-----");
                s = false;
                return;
            }
            
            System.out.println("\t|");

            Collection<MyTinyBookPro> result = options.get(myinp1);
            if ((result.isEmpty()) && (!(myinp1.equals("!Q")))) {
                System.out.println("\t<Not Found>\n\t|");
                continue;
            }

            boolean found = false;
            for (MyTinyBookPro mtbp : result) {
                if (myinp2.isEmpty() || myinp2.equals(mtbp.getItemPartOfSpeech())) {
                    System.out.println("\t" + myinp1.toUpperCase().charAt(0) + myinp1.substring(1, myinp1.length()) + " [" + mtbp.getItemPartOfSpeech() + "] : " + mtbp.getDefinition().toUpperCase().charAt(0) + mtbp.getDefinition().substring(1, mtbp.getDefinition().length()));
                    found = true;
                }
            }

            boolean match = false;
            Collection<MyTinyBookPro> result2 = options.values();
            for (MyTinyBookPro mtbp2 : result2) {
                if ((mtbp2.itemPartOfSpeech.contentEquals(myinp2)) && (!(myinp2.isEmpty())) && (!found)) {
                    match = true;
                }

            }

            if (match) {
                System.out.println("\t<Not found>");
            } else if ((!found) && (!(myinp1.equals("!Q")))) {
                System.out.println("\t<2d argument must be a part of speech>");
            }
            System.out.println("\t|");
        }

    }

}
