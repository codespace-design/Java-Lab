public class program12 {
    static class Student {
        String name;
        int mark;

        Student(String name, int mark) {
            this.name = name;
            this.mark = mark;
        }
    }

    static Student getStudent() {
        return new Student("Arun", 87);
    }

    public static void main(String[] args) {
        Student student = getStudent();
        System.out.println("Student Name : " + student.name + " Mark : " + student.mark);
    }
}
