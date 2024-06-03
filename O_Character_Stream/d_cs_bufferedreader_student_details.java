package O_Character_Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    int roll, marks;
    String name, address, department;

    // Student(int roll, int marks, String name, String address, String department) {
    Student(int r, int m, String n, String a, String d) {
        // this.roll = roll;
        // this.marks = marks;
        // this.name = name;
        // this.address = address;
        // this.department = department;

        roll = r;
        marks = m;
        name = n;
        address = a;
        department = d;
    }

    void displayDetails() {
        // System.out.println("Roll number =" + roll);
        // System.out.println("Marks =" + marks);
        // System.out.println("Name =" + name);
        // System.out.println("Address =" + address);
        // System.out.println("Department =" + department);

        System.out.println(roll + " " + marks + " " + name + " " + address + " " + department);
    }
}

public class d_cs_bufferedreader_student_details {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter roll number :");
        int s_roll = Integer.parseInt(reader.readLine());
        System.out.println("Enter marks :");
        int s_marks = Integer.parseInt(reader.readLine());
        System.out.println("Enter name :");
        String s_name = reader.readLine();
        System.out.println("Enter Address :");
        String s_address = reader.readLine();
        System.out.println("Enter Department :");
        String s_department = reader.readLine();

        Student s1 = new Student(s_roll, s_marks, s_name, s_address, s_department);
        System.out.println("\nDisplaying the details of the student.");
        s1.displayDetails();
    }
}
