
public class program4 {
    int rollNo;
    String name;

    program4(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("Roll Number: " + this.rollNo);
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        program4 obj = new program4(101, "Alice");
        obj.display();
    }
}
