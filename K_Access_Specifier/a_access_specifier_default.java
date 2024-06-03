package K_Access_Specifier;

class Num {
    int a = 67; // not defined any access specifier, i.e: default
}

public class a_access_specifier_default {
    public static void main(String[] args) {
        Num obj = new Num();
        System.out.println("The default value is = " + obj.a);
    }
}
