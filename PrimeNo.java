import java.util.Scanner;

public class PrimeNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int number = sc.nextInt();

        boolean flag = true;

        if(number <= 1){
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is not Prime");
        }

        sc.close();
    }
}
