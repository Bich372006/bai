

    public class ClockRunnable implements Runnable {
        private ClockCounter clock;

        public ClockRunnable(ClockCounter clock) {
            this.clock = clock;
        }

        @Override
        public void run() {
            clock.tick();
        }
    }


