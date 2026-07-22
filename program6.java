public class program6 {
    program6() {
        System.out.println("Object Created");
    }

    protected void finalize() {
        System.out.println("Object Destroyed");
    }

    public static void main(String[] args) {
        program6 obj1 = new program6();
        program6 obj2 = new program6();
        program6 obj3 = new program6();

        obj1 = null;
        obj2 = null;
        obj3 = null;

        System.out.println("Garbage Collection Requested");
        System.gc();
    }
}
