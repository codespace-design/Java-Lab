public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("  [" + Thread.currentThread().getName() + "] run() method started.");
        for (int i = 1; i <= 3; i++) {
            System.out.println("  [" + Thread.currentThread().getName() + "] step " + i);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.out.println("  [" + Thread.currentThread().getName() + "] interrupted.");
            }
        }
        System.out.println("  [" + Thread.currentThread().getName() + "] run() method finished.");
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("Part 1: Calling .run() directly");
        System.out.println("==================================================");
        MyThread thread1 = new MyThread("MyThread-DirectRun");
        System.out.println("Main: Before calling thread1.run()");
        thread1.run(); // Synchronous call on main thread
        System.out.println("Main: After calling thread1.run()");

        System.out.println("\n==================================================");
        System.out.println("Part 2: Calling .start()");
        System.out.println("==================================================");
        MyThread thread2 = new MyThread("MyThread-Start");
        System.out.println("Main: Before calling thread2.start()");
        thread2.start(); // Asynchronous call; spawns a new thread
        System.out.println("Main: After calling thread2.start()");

        // Wait for thread2 to finish for clean output
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n==================================================");
        System.out.println("Observation & Explanation:");
        System.out.println("Calling .run() directly executes the method synchronously on the main thread without creating a new thread, whereas calling .start() creates and starts a separate thread that executes run() asynchronously in parallel.");
        System.out.println("==================================================");
    }
}
