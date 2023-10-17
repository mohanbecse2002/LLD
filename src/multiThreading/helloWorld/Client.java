package multiThreading.helloWorld;

/*
create a thread using Runnable interface & Thread class.
Note that Thread class requires a Runnable target as argument.
*/
public class Client {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " Started.");

        HelloWorld hw = new HelloWorld();
        Thread t1 = new Thread(hw);

        // A new thread gets started, concurrently. Once, started the control comes back to Main immediately.
        // the thread starts its own execution concurrently.
        t1.start();

        // wait for the t1 to complete. Here main waits till the thread t1 completes.
        // without join(), main will just complete before even the thread completes.
        t1.join();

        System.out.println(Thread.currentThread().getName() + " Ended.");
    }
}
