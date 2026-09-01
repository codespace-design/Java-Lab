public class program10 {
    static class Student {
        String name;
        int rollNo;

        Student(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }
    }

    static void display(Student student) {
        System.out.println("Student Name : " + student.name + " Roll No : " + student.rollNo);
    }

    public static void main(String[] args) {
        Student student = new Student("Neha", 25);
        System.out.println("Name: " + student.name + " Roll No: " + student.rollNo);
        display(student);
    }
}
