import producerconsumer.QueueBuffer;
import producerconsumer.ProducerRunnable;
import producerconsumer.ConsumerRunnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Chạy bài toán Producer-Consumer ===");

        // Tạo bộ nhớ đệm chung với dung lượng tối đa là 5 phần tử
        QueueBuffer buffer = new QueueBuffer(5);

        // Tạo và chạy luồng sản xuất
        Thread producerThread = new Thread(new ProducerRunnable(buffer));

        // Tạo và chạy luồng tiêu dùng
        Thread consumerThread = new Thread(new ConsumerRunnable(buffer));

        producerThread.start();
        consumerThread.start();
    }
}
