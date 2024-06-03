package L_Static_Modifiers;


public class c_static_methods {
    // instance variable
    int a = 6;

    // static variable
    static int b = 9;

    // instance method
    void displayInstanceMethod()
    {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // static method
    static void displayStaticMethod()
    {
        // System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        c_static_methods obj = new c_static_methods();
        obj.displayInstanceMethod();
        System.out.println();
        displayStaticMethod();
    }
}
