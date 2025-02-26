
public class SellerRunnable implements Runnable {
    private TicketCounter counter;
    private String name;

    public SellerRunnable(TicketCounter counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            counter.sellTicket(name);
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}


