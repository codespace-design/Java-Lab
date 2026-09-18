public class TimerTask2 implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Tick " + i);
                Thread.sleep(300);
            }
            System.out.println(Thread.currentThread().getName() + " completed all 5 ticks successfully.");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted! Caught InterruptedException. Stopping loop early.");
        }
    }

    public static void main(String[] args) {
        Thread timerThread = new Thread(new TimerTask2(), "TimerTask2-Thread");
        System.out.println("Starting TimerTask2 thread...");
        timerThread.start();

        try {
            // Sleep for 500ms to allow 1 or 2 ticks before interrupting
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread: Calling interrupt() on " + timerThread.getName() + "...");
        timerThread.interrupt();
    }
}
