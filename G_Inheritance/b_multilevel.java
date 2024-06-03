package G_Inheritance;

class GrandFather {
    public void GrandDad() {
        System.out.println("Hello Grandpa !!");
    }
}

class Father extends GrandFather {
    public void Dad() {
        System.out.println("Hello Dad !!");
    }
}

class Child extends Father {
    public void Kid() {
        System.out.println("Hello from your child !!");
    }
}

public class b_multilevel {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.Kid();
        c1.Dad();
        c1.GrandDad();
    }
}
