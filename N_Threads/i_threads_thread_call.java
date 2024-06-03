package N_Threads;

public class i_threads_thread_call {

    public void call(String msg) {
        System.out.println(msg);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        i_threads_thread_call obj = new i_threads_thread_call();
        obj.call("Hello Sanothimi");
        System.out.println("Runs after threads");
    }
}