package D_Arrays;

public class d_array_sum_average {
    public static void main(String[] args) {
        int[] numbers = { 23, 45, -67, 89, 0, 4, 56, 55, 12, 43, 65, -9, 7, 45, 16 };

        int sum = 0;
        double avg;

        for (int i : numbers) {
            sum += i;
        }
        int len = numbers.length;
        avg = ((double) sum / (double) len);
        System.out.println("Sum  = " + sum);
        System.out.println("Average  = " + avg);
    }
}
