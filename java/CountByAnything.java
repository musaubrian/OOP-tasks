import java.util.Scanner;

public class CountByAnything {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to count by: ");
        int countBy = sc.nextInt();

        for (int i = countBy; i <= 500; i += countBy) {
            System.out.print(i + " ");
            if (i % (countBy * 10) == 0) {
                System.out.println("\n");
            }
        }

        sc.close();
    }
}