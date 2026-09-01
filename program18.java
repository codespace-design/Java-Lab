public class program18 {
    static int count = 0;

    program18() {
        count++;
    }

    public static void main(String[] args) {
        System.out.println("Create 3 objects");
        new program18();
        new program18();
        new program18();
        System.out.println("Objects Created : " + count);
    }
}
