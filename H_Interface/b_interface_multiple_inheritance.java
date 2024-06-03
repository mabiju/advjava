package H_Interface;

interface ITeacher {
    public void Teach();
}

interface IStudent {
    public void Learn();
}

class College implements ITeacher, IStudent {
    @Override
    public void Teach() {
        System.out.println("Teacher is teaching.");
    }

    @Override
    public void Learn() {
        System.out.println("Student is learning.");
    }
}

public class b_interface_multiple_inheritance {
    public static void main(String[] args) {
        College c1 = new College();
        c1.Teach();
        c1.Learn();
    }
}
