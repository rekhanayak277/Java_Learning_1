package Class_Object_Constructor;

public class StudentClass {
    // Create a class Student with attribute name and age.
    // Use a parameterized constructor to initialize values and display them

      // Define attributes
    String name ; // 1st
     int age; // 2nd
     StudentClass( String name , int age) { //Parameterised constructor

    this. name = name ;
    this. age = age;
}

    public static void main(String[] args) {

        StudentClass Student1 = new StudentClass ("ABC",10 );
        StudentClass Student2 = new StudentClass ("EFG",11 );
        StudentClass Student3 = new StudentClass ("HIG",12 );
        StudentClass Student4 = new StudentClass ("KLM",13 );

        System.out.println("Name  "+"Age");
        System.out.println( Student1.name+"   "+  Student1.age);
        System.out.println( Student2.name+"   "+  Student2.age);
        System.out.println( Student3.name+"   "+  Student3.age);
        System.out.println( Student4.name+"   "+  Student4.age);


    }


    }
