import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CounterThread[] threads = new CounterThread[5];
        Counter counter = new Counter();

        for(int i = 0; i < threads.length; i++) {
            threads[i] = new CounterThread(counter);
        }

        for(int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        for(int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        //Runnable
        Thread counterRunnable = new Thread(new CounterRunnable(counter));
        counterRunnable.start();

        System.out.println(MessageFormat.format("Valor final del contador {0}", counter.getCounter()));
    }
}