package G_Inheritance;

class Vehicle {
    public void accelerate() {
        System.out.println("I'm moving towards my destination.");
    }
}

class Aeroplane extends Vehicle {
    public void fly() {
        System.out.println("I'm flying.");
    }
}

class Motorbike extends Vehicle {
    public void run() {
        System.out.println("I'm running on road.");
    }
}

public class c_hierarchical {
    public static void main(String[] args) {
        Aeroplane Boeing474 = new Aeroplane();
        Boeing474.fly();
        Boeing474.accelerate();

        Motorbike DukatiM12 = new Motorbike();
        DukatiM12.run();
        DukatiM12.accelerate();

        // DukatiM12.fly(); // inaccessible
    }
}
