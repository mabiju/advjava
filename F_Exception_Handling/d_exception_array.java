package F_Exception_Handling;

public class d_exception_array {
    public static void main(String[] args) {
        int num[] = { 12, 34, 56, 78, 90, 33, 455, 67, 89 };
        try {
            for (int i = 0; i <= num.length; i++) {
                System.out.println(num[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index bound exception handled. " + e);
        }
    }
}
