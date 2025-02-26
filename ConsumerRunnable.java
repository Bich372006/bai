
    package producerconsumer;

    public class ConsumerRunnable implements Runnable {
        private QueueBuffer buffer;

        public ConsumerRunnable(QueueBuffer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void run() {
            while (true) {
                buffer.consume();
                try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }


