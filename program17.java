public class program17 {
    static class Student {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Maya");
        student.setAge(19);
        System.out.println("Student Name : " + student.getName() + " Age : " + student.getAge());
    }
}
