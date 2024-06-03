package N_Threads;

class ThreadDemo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread());
    }
}

public class f_threads_priority {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();

        Thread t1 = new Thread(td, "Hello Ram");
        Thread t2 = new Thread(td, "Hello Sita");
        Thread t3 = new Thread(td, "Hello Laxman");

        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(4);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());

        t1.start();
        t2.start();
        t3.start();
    }
}
