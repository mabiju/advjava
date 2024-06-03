package L_Static_Modifiers;

class Student {
    int roll;
    String name;
    static String clzName = "Sanothimi";

    void input(int r, String n) {
        roll = r;
        name = n;
    }

    void output() {
        System.out.println("Roll =" + roll);
        System.out.println("Name =" + name);
        System.out.println("College name =" + clzName);
    }
}

public class b_static_fields_student_info {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.input(11, "Ram");
        s2.input(12, "Sita");
        s3.input(13, "Laxman");

        s1.output();
        System.out.println();
        Student.clzName = "Bhaktapur";
        s2.output();
        System.out.println();
        s3.output();
    }
}
