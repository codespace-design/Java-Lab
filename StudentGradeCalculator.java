import java.util.Scanner;

public class StudentGradeCalculator {

    public static char CalculateGrade(double marks){
        if(marks >= 90 && marks <= 100){
            return 'A';
        } else if(marks >= 80 && marks < 90){
            return 'B';
        } else if(marks >= 70 && marks < 80){
            return 'C';
        } else {
            return 'D';
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Marks = ");
        double marks = sc.nextDouble();

        char result = CalculateGrade(marks);
        System.out.println("Grade = " + result);
    }
}
