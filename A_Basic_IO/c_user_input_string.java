package A_Basic_IO;

import java.util.Scanner;

public class c_user_input_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("The name =" + name);
        sc.close();
    }
}
