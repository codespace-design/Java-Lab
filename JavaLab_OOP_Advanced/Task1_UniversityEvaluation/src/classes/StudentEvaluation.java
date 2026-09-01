public abstract class StudentEvaluation {
    protected String studentName;
    protected int registrationNumber;
    protected String courseName;
    protected String semester;

    public StudentEvaluation(String studentName, int registrationNumber, String courseName, String semester) {
        this.studentName = studentName;
        this.registrationNumber = registrationNumber;
        this.courseName = courseName;
        this.semester = semester;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Course: " + courseName);
        System.out.println("Semester: " + semester);
    }

    public abstract int calculateTotalMarks();

    public abstract void displayGrade();
}
