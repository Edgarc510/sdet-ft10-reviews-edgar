package org.eac.day3.Reviews.topic1_class_and_object;

public class Book { // Book is a class

    // instance variables
    int length;
    String author;

    // static variables
    static String publisher;

    static {
        publisher = "EAC Learning";
    } /*
        the static block will be executed the first time the class is used

    Q: Why use the static block, can't we just initialize on line 10?
        -> in this case we could have, but the static block is needed whenever there is other code statements that need to be run as part of set up. The static block can run other code. It's not just for initializing
    */

    //Constructor does not have a return type, it is block of code that it is run everytime an object of the class is created
    public Book(int length, String author) {
        this.length = length;
        this.author = author;
    }

    public static void entertainment(){
        System.out.println("Books are a source of entertainment");
    }

    // not using the static keyword allows the creation of instance methods which are access by the objects of the classes
    public void read() {
        System.out.println("Reading book by " + author);
    }

}
