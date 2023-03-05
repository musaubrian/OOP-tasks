import java.util.Scanner;

public class Inbetween {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int second = sc.nextInt();

        int start = Math.min(first, second);
        int end = Math.max(first, second);

        if (start == end) {
            System.out.println("There are no integers between the two values.");
        } else {
            System.out.print("Integers between " + start + " and " + end + ": ");

            for (int i = start + 1; i < end; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
