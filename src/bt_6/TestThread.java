package bt_6;

public class TestThread {
    public static void main(String[] args) {
        Runnable lazy = new LazyPrimeFactorization();
        Runnable optimized = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazy);
        Thread optimizedThread = new Thread(optimized);

        lazyThread.start();
        optimizedThread.start();
    }
}
