package DemoMethodOverloading;

public class MethodOverloading_AreaCalculator {
    /*
    Area Calculator
Create a method area (int side) to calculate the area of a square.
Overload it with area (int length, int breadth) to calculate the area of a rectangle.
Overload again with area(double radius) to calculate the area of a circle.
     */

    public static int Area(int a) {

        int area = a*a;

        return area;
    }

    public static int Area(int a, int b) {

        int area = a*b;

        return area;
    }

    public static double Area(double r) {

        double area = (Math.PI * r * r);

        return area;
    }

    public static void main(String[] args) {


        System.out.println( "Area of a Square is " + Area (5)+ " sq.mtr" );
        System.out.println( "Area of a rectangle is " + Area(5, 4) + " sq.mtr");
        System.out.println("Area of a circle is " + Area(5) + " sq.mtr");
    }
}