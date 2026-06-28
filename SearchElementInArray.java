import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                position = i + 1; // 1-based position
                break;
            }
        }

        if (position != -1) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
