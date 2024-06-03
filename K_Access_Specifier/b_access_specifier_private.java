package K_Access_Specifier;

class Student {
    public int roll = 89;
    // private int roll = 89;
}

public class b_access_specifier_private {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Roll number = " + s1.roll);
    }
}
