package Class_Object_Constructor;

import javax.security.sasl.AuthorizeCallback;
import javax.swing.border.TitledBorder;
import java.awt.print.Book;

public class BookClass {
    //Create a class Book with field title and author.
    // Create 3 objects of the class with different values and display them.

         String Title ;
         String Author;


         BookClass (String Title , String Author) {

             this.Title = Title;
             this.Author = Author;

         }

    public static void main(String[] args) {

        BookClass Book_1 = new BookClass("Physics" , "Remy");

        BookClass Book_2 = new BookClass("Chemistry" , "Michelle");

        BookClass Book_3 = new BookClass("Mathematics" , "Julie");


        System.out.println("The first Book is " + Book_1.Title +" & the author is " + Book_1.Author);
        System.out.println("The first Book is " + Book_2.Title +" & the author is " + Book_2.Author);
        System.out.println("The first Book is " + Book_3.Title +" & the author is " + Book_3.Author);


    }

}




