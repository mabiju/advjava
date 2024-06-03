package I_Method_Overriding;

class Mom {
    public void Cooking() {
        System.out.println("Mom is cooking...");
    }
}

class Daughter extends Mom {
    public void Cooking() {
        System.out.println("Papa ki pari is cooking delicious meals.");
    }
}

public class a_method_overriding {
    public static void main(String[] args) {
        Daughter d1 = new Daughter();
        d1.Cooking();
    }
}
