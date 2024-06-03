package D_Arrays;

public class b_arrays_for_loop {
    public static void main(String[] args) {
        int[] marks = { 12, 34, 56, 78, 90, 22, 33, 44, 55, 55, 67 };
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Element " + (i+1) + " = " + marks[i]);
        }
    }
}
