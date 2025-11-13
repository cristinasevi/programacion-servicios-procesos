public class Counter {
    private int counter;

    public void increment() {

        // while (wait()) {}
        // lock()

        counter++;

        // signal()
        // unlock()
    }

    public int getCounter() {
        return counter;
    }
}