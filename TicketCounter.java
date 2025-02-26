
public class TicketCounter {
    private int tickets = 10;

    public synchronized void sellTicket(String sellerName) {
        if (tickets > 0) {
            System.out.println(sellerName + " sold ticket #" + tickets);
            tickets--;
        } else {
            System.out.println(sellerName + " no tickets left!");
        }
    }
}


