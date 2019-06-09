/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinyBook;

/**
 *
 * @author rayafarshad
 */
// enums are static thats why we dont have setter method.
//enum actually reperesent the database
//1-encapsuation and protecting the data thats wh ywe want all the data in a database.
//2-code
//3-input,output for user
public enum Dictionary {
    book("A set of pages.", "To arrange something on a particular date."),
    bookable("Can be ordered."),
    bookbinder("A person who fastens the pages of books."),
    bookcase("A piece of furniture with shelves."),
    csc220("Data Structures.", "Ready to create complex data structures.", "To create data structures.");

    private String str1;
    private String str2;
    private String str3;

    private Dictionary(String s1) {
        this.str1 = s1;
    }

    private Dictionary(String s1, String s2) {
        this.str1 = s1;
        this.str2 = s2;
    }

    private Dictionary(String s1, String s2, String s3) {
        this.str1 = s1;
        this.str2 = s2;
        this.str3 = s3;
    }

    public String getStr1() {
        return str1;
    }

    public String getStr2() {
        return str2;
    }

    public String getStr3() {
        return str3;
    }

}
