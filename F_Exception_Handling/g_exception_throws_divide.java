package F_Exception_Handling;

public class g_exception_throws_divide {
    public int divNum(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        g_exception_throws_divide obj = new g_exception_throws_divide();
        try {
            System.out.println("The result = " + obj.divNum(12, 0));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero" + e);
        }
    }
}
