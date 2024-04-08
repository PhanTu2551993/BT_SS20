package bt_6;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int num = 2;
        while (true) {
            if (isPrime(num)) {
                System.out.println("Lazy Prime Factorization: " + num);
            }
            num++;
        }
    }
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
