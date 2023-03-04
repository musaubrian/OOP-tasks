import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PastPresentFuture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String datePrompt;

        System.out.println("Enter a date (DD/MM/YYYY): ");
        datePrompt = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate date = LocalDate.parse(datePrompt, formatter);

        LocalDate now = LocalDate.now();

        if (date.getYear() != now.getYear()) {
            System.out.println("The entered date is not this year.");
        } else if (date.isBefore(now)) {
            System.out.println("The entered date is in an earlier month this year.");
        } else if (date.isAfter(now)) {
            System.out.println("The entered date is in a later month this year.");
        } else {
            System.out.println("The entered date is this month.");
        }

        sc.close();

    }
}
