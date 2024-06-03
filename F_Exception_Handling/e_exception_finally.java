package F_Exception_Handling;

public class e_exception_finally {
    public static void main(String[] args) {
        int a = 45, b = 0, result;
        try {
            result = a / b;
            System.out.println("The result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide a non zero value by zero." + e);
        }
        finally
        {
            System.out.println("Be careful when you take zero as a divisor.");
        }
    }
}
