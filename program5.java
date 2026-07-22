public class program5 {
    int id;
    String name;
    String course;

    program5() {
        this(101, "Alice");
        System.out.println("Default constructor called.");
    }

    program5(int id, String name) {
        this(id, name, "Java");
        System.out.println("Parameterized constructor called.");
    }

    program5(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
        System.out.println("Parameterized constructor with course called.");
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        program5 obj = new program5();
        obj.display();
    }
}
