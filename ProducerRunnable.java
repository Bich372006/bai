package producerconsumer;

public class ProducerRunnable implements Runnable {
    private QueueBuffer buffer;

    public ProducerRunnable(QueueBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            buffer.produce(i++);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
