// WAP in Java to enter employee id and name and to display the details using interface
package H_Interface;

import java.util.Scanner;

interface IEmployee {
    public void getData();

    public void displayData();
}

public class d_interface_employee_details implements IEmployee {
    int emp_id;
    String emp_name;

    public static void main(String[] args) {
        d_interface_employee_details emp1 = new d_interface_employee_details();
        emp1.getData();
        emp1.displayData();
    }

    @Override
    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id:");
        emp_id = sc.nextInt();
        System.out.println("Enter employee name:");
        emp_name = sc.next();
        sc.close();
    }

    @Override
    public void displayData() {
        System.out.println("Employee ID =  " + emp_id);
        System.out.println("Employee Name =  " + emp_name);
    }
}
