package F_Exception_Handling;

public class c_exception_array_null {
    public static void main(String[] args) {
        // int num[] = null;
        int num[] = { 12, 34, 56, 78, 90, 33, 455, 67, 89 };

        try {
            System.out.println(num[6]);
            // } catch (ArithmeticException e) {
            // System.out.println("Arithmetic exception handled " + e);
            // }
            // } catch (NullPointerException e) {
            // System.out.println("Null Pointer exception handled " + e);
            // }
        } catch (Exception e) {
            System.out.println("Exception is handled" + e);
        }
    }
}
