public class Main {
    public static void main(String[] args) {
        StudentEvaluation[] students = new StudentEvaluation[5];

        students[0] = new UGCourseEvaluation("Aisha", 101, "B.Sc Computer Science", "Semester 5", 90, 80, 88);
        students[1] = new UGCourseEvaluation("Rohit", 102, "B.Tech Mechanical", "Semester 6", 76, 70, 68);
        students[2] = new PGCourseEvaluation("Meera", 201, "M.Sc Data Science", "Semester 2", 88, 90, 85);
        students[3] = new CertificateCourseEvaluation("Arun", 301, "Java Fundamentals", "Certificate", 78, 82, 90);
        students[4] = new DiplomaCourseEvaluation("Priya", 401, "Web Development", "Semester 3", 80, 75, 88);

        for (StudentEvaluation student : students) {
            System.out.println("-------------------------------------------------");
            student.displayStudentDetails();
            System.out.println("Total Marks: " + student.calculateTotalMarks());
            student.displayGrade();
        }
    }
}
