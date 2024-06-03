package R_Reading_Writing_Objects;

import java.io.*;

class Student implements Serializable {
    int roll, marks;
    String name;

    Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return roll + " " + name + " " + marks;
    }
}

public class a_reading_writing_objects {
    public static void main(String[] args) throws Exception {
        File file = new File("D:/SCAJAVAM1/R_Reading_Writing_Objects/sita.txt");
        Student s1 = new Student(12, "Sita Rai", 67);
        System.out.println(s1);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(s1);
        oos.close();
    }
}
