
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Chạy bộ đếm đồng hồ ===");

        // Tạo đối tượng đồng hồ
        ClockCounter clock = new ClockCounter();

        // Tạo và chạy luồng đồng hồ
        Thread clockThread = new Thread(new ClockRunnable(clock));
        clockThread.start();
    }
}
