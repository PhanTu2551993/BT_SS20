package bt_6;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                System.out.println("Optimized Prime Factorization: " + num);
            }
            num++;
        }
    }
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
