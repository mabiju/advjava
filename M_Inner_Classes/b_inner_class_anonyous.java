package M_Inner_Classes;

public class b_inner_class_anonyous {
    interface Hello {
        void hi();
    }

    public static void main(String[] args) {
        // creating an instance of the interface using an anonymous inner class
        Hello obj = new Hello() {
            @Override
            public void hi() {
                System.out.println("This is an anonymous inner class.");
            }
        };
        // calling the method defined in the interface using its instance
        obj.hi();
    }
}
