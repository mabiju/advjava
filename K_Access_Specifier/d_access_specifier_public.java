package K_Access_Specifier;

class Teacher {
    public int t_id = 67;
}

public class d_access_specifier_public {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        System.out.println("Teacher id = " + t1.t_id);
    }
}
