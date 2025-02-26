package producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBuffer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    public QueueBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int item) {
        while (queue.size() == capacity) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        queue.add(item);
        System.out.println("Produced: " + item);
        notify();
    }

    public synchronized void consume() {
        while (queue.isEmpty()) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        int item = queue.poll();
        System.out.println("Consumed: " + item);
        notify();
    }
}
