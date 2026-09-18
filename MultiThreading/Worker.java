public class Worker implements Runnable {
    private String taskName;
    private int loopCount;

    public Worker(String taskName, int loopCount) {
        this.taskName = taskName;
        this.loopCount = loopCount;
    }

    @Override
    public void run() {
        for (int i = 1; i <= loopCount; i++) {
            System.out.println(taskName + " - step " + i);
            try {
                Thread.sleep(200); // sleep 200ms each time
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        // Three Worker instances with different names and different loop counts
        Worker worker1 = new Worker("Worker-Alpha", 5);
        Worker worker2 = new Worker("Worker-Beta", 3);
        Worker worker3 = new Worker("Worker-Gamma", 4);

        // Create three Thread objects from the three Worker instances
        Thread thread1 = new Thread(worker1);
        Thread thread2 = new Thread(worker2);
        Thread thread3 = new Thread(worker3);

        System.out.println("Starting all three worker threads...");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
