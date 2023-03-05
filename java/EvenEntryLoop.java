import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        while (number != 999) {
            System.out.print("Enter an even number or 999 to stop: ");
            number = sc.nextInt();

            if (number % 2 == 0 && number != 999) {
                System.out.println("Good job!");
            } else if (number % 2 == 1 && number != 999) {
                System.out.println("Error: Please enter an even number.");
            }
        }

        sc.close();
    }
}
