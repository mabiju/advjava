package F_Exception_Handling;

public class b_exception_problem_solution {
    public static void main(String[] args) {
        int a = 45, b = 0, result;
        try {
            result = a / b;
            System.out.println("The result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide a non zero value by zero." + e);
        }
    }
}
