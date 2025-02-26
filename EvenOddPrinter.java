

    public class EvenOddPrinter {
        private int num = 1;
        private final int max;

        public EvenOddPrinter(int max) {
            this.max = max;
        }

        public synchronized void printEven() {
            while (num <= max) {
                if (num % 2 == 0) {
                    System.out.println("Even: " + num);
                    num++;
                    notify();
                } else {
                    try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                }
            }
        }

        public synchronized void printOdd() {
            while (num <= max) {
                if (num % 2 != 0) {
                    System.out.println("Odd: " + num);
                    num++;
                    notify();
                } else {
                    try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
                }
            }
        }
    }


