package N_Threads;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Running : " + Thread.currentThread().getName());
    }
}

public class h_threads_thread_group {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myrunnable = new MyRunnable();
        ThreadGroup tg = new ThreadGroup("Group Sanothimi");

        Thread t1 = new Thread(tg, myrunnable, "Ram");
        Thread t2 = new Thread(tg, myrunnable, "Sita");
        Thread t3 = new Thread(tg, myrunnable, "Laxman");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("The thread group name is = " + tg.getName());

        tg.list();
    }
}
