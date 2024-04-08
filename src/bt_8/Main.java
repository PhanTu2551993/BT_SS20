package bt_8;

public class Main {
        public static void main(String[] args) {
            SharedVariable sharedVariable = new SharedVariable();

            Thread increaseThread = new Thread(new IncreaseThread(sharedVariable));
            increaseThread.start();

            Thread decreaseThread = new Thread(new DecreaseThread(sharedVariable));
            decreaseThread.start();
        }
    }

    class SharedVariable {
        private int value = 10;

        public synchronized void increase() {
            value++;
            System.out.println("Increased value: " + value);
        }

        public synchronized void decrease() {
            value--;
            System.out.println("Decreased value: " + value);
        }
    }

    class IncreaseThread implements Runnable {
        private SharedVariable sharedVariable;

        public IncreaseThread(SharedVariable sharedVariable) {
            this.sharedVariable = sharedVariable;
        }

        @Override
        public void run() {
            while (true) {
                sharedVariable.increase();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
    
    class DecreaseThread implements Runnable {
        private SharedVariable sharedVariable;

        public DecreaseThread(SharedVariable sharedVariable) {
            this.sharedVariable = sharedVariable;
        }

        @Override
        public void run() {
            while (true) {
                sharedVariable.decrease();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }


