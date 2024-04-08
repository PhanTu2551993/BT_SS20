package bt_7;

import java.util.Random;

public class RandomNumberThread extends Thread{
    @Override
    public void run() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Random number: " + randomNumber);
    }
}
