package Class_Object_Constructor;

//Create a class Counter that counts how many objects are created using a static variable inside the constructor.

public class Counter_Object {

         static int count = 0; // count for number of objects

        // Constructor increments the count whenever a new object is created
        public Counter_Object() {
            count++;
            System.out.println( count + "Objects are created.");
        }

        // Static method to return how many objects have been created
        public static int getCount() {
            return count;
        }

        // Main method to test the Counter class
        public static void main(String[] args) {
            // Creating objects
            Counter_Object c1 = new Counter_Object();
            Counter_Object c2 = new Counter_Object();
            Counter_Object c3 = new Counter_Object();
            Counter_Object c4 = new Counter_Object();

            // Display total number of objects created
            System.out.println("Total objects created: " + Counter_Object.getCount());
        }
    }



