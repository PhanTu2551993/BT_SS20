package bt_4;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Number: "+i + ", HashCode: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

