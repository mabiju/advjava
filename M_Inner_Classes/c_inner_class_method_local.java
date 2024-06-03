package M_Inner_Classes;

// Java Program to Illustrate Inner class can be declared within a method of outer class
class MyOuterClass {

    // Method inside OuterClass class
    void outerMethod() {

        // Print statement
        System.out.println("Inside outerMethod");

        // InnerClass class
        // It is local to outerMethod()
        class MyInnerClass {

            // Method defined inside InnerClass class
            void innerMethod() {

                // Print statement whenever InnerClass class is called
                System.out.println("Inside innerMethod");
            }
        }

        // Creating object of InnerClass class
        MyInnerClass y = new MyInnerClass();

        // Calling over method defined inside it
        y.innerMethod();
    }
}

public class c_inner_class_method_local {
    public static void main(String[] args) {
        // Creating object of OuterClass class inside main() method
        MyOuterClass x = new MyOuterClass();

        // Calling over the same method as we did for InnerClass class above
        x.outerMethod();
    }
}
