package J_Final;

// final class SuperClass {
class SuperClass {
    public void SuperMethod() {
        System.out.println("Method from SuperClass");
    }
}

class SubClass extends SuperClass {
    public void SubMethod() {
        System.out.println("Method from SubClass");
    }
}

public class b_final_class {
    public static void main(String[] args) {
        SubClass sub1 = new SubClass();
        sub1.SuperMethod();
        sub1.SubMethod();
    }
}
