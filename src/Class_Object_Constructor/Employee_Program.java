package Class_Object_Constructor;

// Create a class Employee with fields id and salary.
// Write a constructor to create a new object with the same values as another object.

public class Employee_Program {


    int id;

   double salary;

    Employee_Program() {    // default constructor

      this.salary = salary;

       this.id = id;
    }

       Employee_Program(int id, double salary) {  // parameterised constructor

        this.salary = salary;

        this.id = id;

    }

    Employee_Program(Employee_Program copy) {   // copy constructor

        this. salary = copy.salary;

        this. id = copy.id;

    }

    public void print () {     // method for printing the statements

        System.out.println("Employee Id is " + id);

        System.out.println("Employee salary is " + salary);
    }


    public static void main(String[] args) {


        Employee_Program obj1 = new Employee_Program(10, 30000.00);


        Employee_Program obj2 = new Employee_Program(obj1);

        System.out.println("Details or the original employee");

        obj1.print();

        System.out.println("Details of copy employee");

        obj2.print();
    }


}
