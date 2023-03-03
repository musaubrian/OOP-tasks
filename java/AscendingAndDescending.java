import java.util.Scanner;
import java.util.Arrays;

public class AscendingAndDescending{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []numbers = new int[3];

        // Get the three numbers
        System.out.println("First number: ");
        numbers[0] = scanner.nextInt();
        System.out.println("Second number: ");
        numbers[1] = scanner.nextInt();
        System.out.println("Third number: ");
        numbers[2] = scanner.nextInt();

        // Sort in ascending order
        Arrays.sort(numbers);

        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        // Sort in descending order
        int[] reversedNums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversedNums[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println("The numbers in descending order are: " + Arrays.toString(reversedNums));
        scanner.close();
    }
}

