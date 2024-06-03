package A_Basic_IO;

import java.util.Scanner;

public class e_area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int length = sc.nextInt();
        System.out.println("Enter breadth:");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("The area of rectangle = " + area + " unit square.");
        sc.close();
    }
}
