package N_Threads;

class MeroClass implements Runnable {
    public void run() {
        System.out.println("Mero thread is running.");
    }
}

public class e_threads_runnable {
    public static void main(String[] args) {
        MeroClass obj = new MeroClass();
        Thread t = new Thread(obj);

        t.start();
    }
}