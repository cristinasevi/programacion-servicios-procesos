import java.text.MessageFormat;

public class CounterThread extends Thread {
    private final Counter counter;

    public CounterThread(Counter counter) {
        super();
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }

        System.out.println("Fin del conteo");
    }
}