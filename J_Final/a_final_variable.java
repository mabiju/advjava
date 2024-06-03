package J_Final;

class MyClass {
    final int a = 78;

    public void DisplayData() {
        System.out.println("The value = " + a);
    }
}

public class a_final_variable {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.DisplayData();
    }
}
