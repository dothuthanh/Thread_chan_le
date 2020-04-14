public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread o1 = new Thread(oddThread);
        Thread o2 = new Thread(evenThread);
        o1.start();
        o1.join();
        o2.start();

    }
}
