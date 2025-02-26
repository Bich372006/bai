
    public class OddRunnable implements Runnable {
        private EvenOddPrinter printer;

        public OddRunnable(EvenOddPrinter printer) {
            this.printer = printer;
        }

        @Override
        public void run() {
            printer.printOdd();
        }
    }


