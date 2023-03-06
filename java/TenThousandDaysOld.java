
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TenThousandDaysOld {
    public static void main(String[] args) {
        // Prompt user for birthdate input
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateStr = System.console().readLine();

        // Parse input into LocalDate object
        LocalDate birthdate = LocalDate.parse(birthdateStr, DateTimeFormatter.ISO_DATE);

        // Calculate number of days until 10000th day of life
        LocalDate tenThousandthDay = birthdate.plusDays(10000);
        long daysUntilTenThousandthDay = ChronoUnit.DAYS.between(LocalDate.now(), tenThousandthDay);

        // Display result
        System.out.println("Your 10000th day of life will be on " + tenThousandthDay + ".");
        System.out.println("There are " + daysUntilTenThousandthDay + " days until then.");
    }
}
