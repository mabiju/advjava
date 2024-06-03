package G_Inheritance;

class Mom {
    public void hiChild() {
        System.out.println("Hi Child, this is your mom");
    }
}

class Dad {
    public void helloChild() {
        System.out.println("Hello Child, this is your dad");
    }
}

/* class Child extends Mom,Dad
{

    public void ChildMethod() {
        System.out.println("Greetings from your child");
    }

    Note : Multiple Inheritance is not possible with Java Class, this can be solved with Interface.
} */

public class f_multiple_problem_scenario {
    public static void main(String[] args) {
        /* Child son = new Child();
        son.hiChild();
        son.helloChild(); */
    }
}
