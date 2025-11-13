public class CounterRunnable implements Runnable{
    private final Counter counter;

    public CounterRunnable(Counter counter){
        super();
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }

        System.out.println("Fin del conteo en runnable");
    }
}