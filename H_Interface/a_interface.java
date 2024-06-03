package H_Interface;

interface ICollege {
    public void Study();
}

class Student implements ICollege {
    @Override
    public void Study() {
        System.out.println("Student is studying.");
    }

}

public class a_interface {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Study();
    }
}
