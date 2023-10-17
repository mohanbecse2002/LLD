package multiThreading.printNumber;

/*
Print a number in a different thread.
*/
public class Client {

    public static void main(String[] args) {
        //Call the NumberPrinter for each number value.
        //This way a thread is created for printing that one number.
        for(int i=0; i<1000001; i++){
            NumberPrinter np = new NumberPrinter(i);
            Thread t = new Thread(np);
            t.start();
        }

    }

}
