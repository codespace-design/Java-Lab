public class DiplomaCourseEvaluation extends StudentEvaluation {
    private int labMarks;
    private int projectMarks;
    private int vivaMarks;

    public DiplomaCourseEvaluation(String studentName, int registrationNumber, String courseName, String semester,
                                  int labMarks, int projectMarks, int vivaMarks) {
        super(studentName, registrationNumber, courseName, semester);
        this.labMarks = labMarks;
        this.projectMarks = projectMarks;
        this.vivaMarks = vivaMarks;
    }

    @Override
    public int calculateTotalMarks() {
        return labMarks + projectMarks + vivaMarks;
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
        } else {
            System.out.println("Grade: F");
        }
    }
}
