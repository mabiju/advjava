package J_Final;

class Mom {
    // final public void Cooking() {
    public void Cooking() {
        System.out.println("Mom is cooking...");
    }
}

class Daughter extends Mom {
    public void Cooking() {
        System.out.println("Papa ki pari is cooking delicious meals.");
    }
}

public class c_final_method {
    public static void main(String[] args) {
        Daughter d1 = new Daughter();
        d1.Cooking();
    }
}
