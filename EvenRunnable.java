

public class EvenRunnable implements Runnable {
    private final EvenOddPrinter printer;

    public EvenRunnable(EvenOddPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printEven();
    }
}


