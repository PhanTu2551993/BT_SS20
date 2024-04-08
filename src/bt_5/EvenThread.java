package bt_5;

public class EvenThread extends Thread{
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
