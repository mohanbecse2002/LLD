package multiThreading.printNumber;

//This Class prints a number.
//The number is passed to this class through constructor arguments.
public class NumberPrinter implements Runnable{

    private int number;

    NumberPrinter(int number){
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + this.number);
    }
}
