package I_Method_Overriding;

class GrandPa {
    public void hello() {
        System.out.println("Hello from Grandpa.");
    }
}

class Father extends GrandPa {
    public void hello() {
        System.out.println("Hello from Father.");
    }
}

class Son extends Father {
    public void hello() {
        System.out.println("Hello Grandpa and Father.");
    }
}

public class b_method_overriding {
    public static void main(String[] args) {
        GrandPa a, b, c;
        a = new GrandPa();
        b = new Father();
        c = new Son();

        a.hello();
        b.hello();
        c.hello();
    }
}
