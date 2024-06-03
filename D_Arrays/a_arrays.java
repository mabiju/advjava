package D_Arrays;

public class a_arrays {
    public static void main(String[] args) {
        /*
         * // declaring an array
         * // datatype[] array_name = new datatype[size]
         * int[] marks = new int[5];
         * 
         * // initializing an array
         * // array_name[index] = value;
         * marks[0] = 45;
         * marks[1] = 67;
         */

        // declaring and initializing an array
        int[] marks = { 45, 67, 89, 87, 13 };
        int size = marks.length;
        System.out.println("The size of the array = " + size);
        System.out.println("First Element = " + marks[0]);
        System.out.println("Second Element = " + marks[1]);
        System.out.println("Third Element = " + marks[2]);
        System.out.println("Fourth Element = " + marks[3]);
        System.out.println("Fifth Element = " + marks[4]);
    }
}
