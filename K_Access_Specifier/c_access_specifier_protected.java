package K_Access_Specifier;

class Calc {
    protected int add(int a, int b) {
        return (a + b);
    }
}

public class c_access_specifier_protected extends Calc {
    public static void main(String[] args) {
        c_access_specifier_protected obj = new c_access_specifier_protected();
        System.out.println("The sum = " + obj.add(20, 10));
    }
}
