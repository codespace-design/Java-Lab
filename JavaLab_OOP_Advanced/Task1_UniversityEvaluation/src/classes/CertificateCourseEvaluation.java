public class CertificateCourseEvaluation extends StudentEvaluation {
    private int practicalMarks;
    private int assignmentMarks;
    private int attendanceMarks;

    public CertificateCourseEvaluation(String studentName, int registrationNumber, String courseName, String semester,
                                      int practicalMarks, int assignmentMarks, int attendanceMarks) {
        super(studentName, registrationNumber, courseName, semester);
        this.practicalMarks = practicalMarks;
        this.assignmentMarks = assignmentMarks;
        this.attendanceMarks = attendanceMarks;
    }

    @Override
    public int calculateTotalMarks() {
        return practicalMarks + assignmentMarks + attendanceMarks;
    }

    @Override
    public void displayGrade() {
        int total = calculateTotalMarks();
        if (total >= 80) {
            System.out.println("Grade: Distinction");
        } else if (total >= 65) {
            System.out.println("Grade: First Class");
        } else if (total >= 50) {
            System.out.println("Grade: Second Class");
        } else {
            System.out.println("Grade: Needs Improvement");
        }
    }
}
