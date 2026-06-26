import java.util.Scanner;
class StudentInfo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll No: ");
        int roll_no = sc.nextInt();
        sc.nextLine();

        System.out.print("Course: ");
        String course = sc.nextLine();

        System.out.print("Percentage: ");
        Double percentage = sc.nextDouble();

        System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.println("Name: " +name);
        System.out.println("Roll No: " +roll_no);
        System.out.println("Course: " +course);
        System.out.println("Percentage: " +percentage);

        sc.close();
        
    }
}