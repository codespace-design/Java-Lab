public class CountdownThread extends Thread {

    public CountdownThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println(getName() + " - Countdown: " + i);
            try {
                Thread.sleep(500); // pause 500ms between numbers
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        // Start two countdown threads with different names
        CountdownThread thread1 = new CountdownThread("Thread-1");
        CountdownThread thread2 = new CountdownThread("Thread-2");

        System.out.println("Starting Countdown Threads...");
        thread1.start();
        thread2.start();
    }
}
