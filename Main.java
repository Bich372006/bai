
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Chạy bài toán in số chẵn lẻ ===");

        // Tạo đối tượng quản lý in số chẵn lẻ
        EvenOddPrinter printer = new EvenOddPrinter(1000);

        // Tạo và chạy hai luồng: số chẵn và số lẻ
        Thread evenThread = new Thread(new EvenRunnable(printer));
        Thread oddThread = new Thread(new OddRunnable(printer));

        evenThread.start();
        oddThread.start();
    }
}
