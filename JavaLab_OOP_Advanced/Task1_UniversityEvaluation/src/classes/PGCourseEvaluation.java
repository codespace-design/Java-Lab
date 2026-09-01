public class PGCourseEvaluation extends StudentEvaluation {
    private int seminarMarks;
    private int projectMarks;
    private int vivaMarks;

    public PGCourseEvaluation(String studentName, int registrationNumber, String courseName, String semester,
                             int seminarMarks, int projectMarks, int vivaMarks) {
        super(studentName, registrationNumber, courseName, semester);
        this.seminarMarks = seminarMarks;
        this.projectMarks = projectMarks;
        this.vivaMarks = vivaMarks;
    }

    @Override
    public int calculateTotalMarks() {
        return seminarMarks + projectMarks + vivaMarks;
    }

    @Override
    public void displayGrade() {
        int total = calculateTotalMarks();
        if (total >= 90) {
            System.out.println("Grade: A+");
        } else if (total >= 80) {
            System.out.println("Grade: A");
        } else if (total >= 70) {
            System.out.println("Grade: B");
        } else if (total >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}
