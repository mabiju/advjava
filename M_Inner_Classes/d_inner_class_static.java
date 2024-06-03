package M_Inner_Classes;

import M_Inner_Classes.Outer.Inner;

// Java Program to Illustrate Static Nested Classes Importing required classes
// Outer class
class Outer {

    // Method
    private static void outerMethod() {

        // Print statement
        System.out.println("Inside outerMethod");
    }

    // Class 2
    // Static inner class
    static class Inner {

        public static void display() {

            // Print statement
            System.out.println("Inside inner class Method");

            // Calling method inside main() method
            outerMethod();
        }
    }
}

public class d_inner_class_static {
    public static void main(String[] args) {
        Inner.display();
        
        // Outer.Inner obj = new Outer.Inner();
        // Calling method via above instance created
        // obj.display();
    }
}
