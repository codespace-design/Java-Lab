public class UGCourseEvaluation extends StudentEvaluation {
    private int assignmentMarks;
    private int quizMarks;
    private int finalExamMarks;

    public UGCourseEvaluation(String studentName, int registrationNumber, String courseName, String semester,
                             int assignmentMarks, int quizMarks, int finalExamMarks) {
        super(studentName, registrationNumber, courseName, semester);
        this.assignmentMarks = assignmentMarks;
        this.quizMarks = quizMarks;
        this.finalExamMarks = finalExamMarks;
    }

    @Override
    public int calculateTotalMarks() {
        return assignmentMarks + quizMarks + finalExamMarks;
    }

    @Override
    public void displayGrade() {
        int total = calculateTotalMarks();
        if (total >= 85) {
            System.out.println("Grade: A");
        } else if (total >= 70) {
            System.out.println("Grade: B");
        } else if (total >= 55) {
            System.out.println("Grade: C");
        } else if (total >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
