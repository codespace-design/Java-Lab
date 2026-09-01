public class program7 {
    static class FinalizeDemo {
        public FinalizeDemo() {
            System.out.println("Object Created");
        }

        protected void finalize() {
            System.out.println("finalize() method called");
        }
    }

    public static void main(String[] args) {
        FinalizeDemo obj = new FinalizeDemo();
        obj = null;
        System.gc();
    }
}
