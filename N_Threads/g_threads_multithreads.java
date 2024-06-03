package N_Threads;

class ThreadOne extends Thread {
    public void run() {
        System.out.println("Thread One");
        System.out.println("Execution of i in Thread One");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End of thread one.");
    }
}

class ThreadTwo extends Thread {
    public void run() {
        System.out.println("Thread Two");
        System.out.println("Execution of i in Thread Two");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("End of thread two.");
    }
}

public class g_threads_multithreads {
    public static void main(String[] args) {
        // life cycle of thread
        // Threads new state
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        // both the above threads are in runnable state
        // running state of both threads
        t1.start();

        // move control to another thread
        // A yield() method is a static method of Thread class
        // and it can stop the currently executing thread and will
        // give a chance to other waiting threads of the same priority.
        Thread.yield();

        // blocked state ThreadOne
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        System.out.println("End of main thread.");
    }
}
