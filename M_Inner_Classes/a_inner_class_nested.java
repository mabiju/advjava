package M_Inner_Classes;

class OuterClass {
    int a = 90;

    class InnerClass {
        public int iMethod() {
            return a;
        }
    }
}

public class a_inner_class_nested {
    public static void main(String[] args) {
        OuterClass outObj = new OuterClass();
        OuterClass.InnerClass innerObj = outObj.new InnerClass();
        System.out.println("The return value = " + innerObj.iMethod());
    }
}
