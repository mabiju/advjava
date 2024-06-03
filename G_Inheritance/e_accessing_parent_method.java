package G_Inheritance;

class Teacher {
    public void Study() {
        System.out.println("Teacher is studying.");
    }
}

class Student extends Teacher {
    public void Study() {
        super.Study();
        System.out.println("Student is studying.");
    }
}

public class e_accessing_parent_method {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Study();
    }
}
