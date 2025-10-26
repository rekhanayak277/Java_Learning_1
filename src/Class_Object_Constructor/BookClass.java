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

        BookClass Book_1 = new BookClass("Book-1" , "Author-1");

        BookClass Book_2 = new BookClass("Book-2" , "Author-1");

        BookClass Book_3 = new BookClass("Book-3" , "Author-1");


        System.out.println("The first Book is " + Book_1.Title +" & the author is " + Book_1.Author);
        System.out.println("The first Book is " + Book_2.Title +" & the author is " + Book_2.Author);
        System.out.println("The first Book is " + Book_3.Title +" & the author is " + Book_3.Author);


    }

}




