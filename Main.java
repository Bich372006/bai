

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Chạy hệ thống bán vé ===");

        // Tạo quầy vé
        TicketCounter counter = new TicketCounter();

        // Tạo và chạy hai nhân viên bán vé
        Thread seller1 = new Thread(new SellerRunnable(counter, "Seller 1"));
        Thread seller2 = new Thread(new SellerRunnable(counter, "Seller 2"));

        seller1.start();
        seller2.start();
    }
}
