package multiThreading.helloWorld;

// Create a class that needs to run a task in separate thread.
// This class should implement Runnable interface.
// run() is the method that needs to be implemented through Runnable interface.
public class HelloWorld implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started.");
        System.out.println(Thread.currentThread().getName() + " Ended.");
    }
}


