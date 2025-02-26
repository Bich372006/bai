

public class ClockCounter {
    private int seconds = 0;

    public synchronized void tick() {
        while (true) {
            System.out.println("Time: " + seconds + "s");
            seconds++;
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
