public class NumberPrinter implements Runnable {
    private boolean printEven;

    public NumberPrinter(boolean printEven) {
        this.printEven = printEven;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (printEven && i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " (Even): " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                }
            } else if (!printEven && i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " (Odd): " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create two Thread objects using NumberPrinter (one for even, one for odd)
        Thread evenThread = new Thread(new NumberPrinter(true), "Even-Thread");
        Thread oddThread = new Thread(new NumberPrinter(false), "Odd-Thread");

        System.out.println("Starting Even and Odd Threads...");
        evenThread.start();
        oddThread.start();
    }
}
