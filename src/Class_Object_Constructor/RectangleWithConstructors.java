package Class_Object_Constructor;

//Create a class Rectangle with constructors:
//No argument → sets length and breadth to 1.
//One argument → sets both length and breadth to the same value.
//Two arguments → sets length and breadth to different values.
//Write a method to calculate area for each case.


public class RectangleWithConstructors {

    int length;
    int breadth;

    // Method declared to calculate area
    public int Area() {

       System.out.println("Area of rectangle is " +  this.length * this.breadth + " sqm");

        return this.length * this.breadth;
}
// No-argument constructor -> sets length and breadth to 1
     RectangleWithConstructors() {      // no argument /default with value 1
        this.length = 1;
        this.breadth = 1;
    }

     RectangleWithConstructors(int side) {  // 1 param / argument constructor with same value
        this.length = side;
        this.breadth = side;
    }

     RectangleWithConstructors(int length, int breadth) {   //Two param  constructor
        this.breadth = breadth;
        this.length = length;
    }


    public static void main(String[] args) {

        RectangleWithConstructors r1 = new RectangleWithConstructors();       // 1x1
        RectangleWithConstructors r2 = new RectangleWithConstructors(5);      // 5x5
        RectangleWithConstructors r3 = new RectangleWithConstructors(5, 10);  // 5x10

        r1.Area(); // should print 1

        r2.Area(); // should print 25

        r3.Area(); // should print 50

    }
}
