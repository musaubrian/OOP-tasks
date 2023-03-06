import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysTilNextMonth {
    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Calculate the date of the first day of next month
        LocalDate firstDayOfNextMonth = today.plusMonths(1).withDayOfMonth(1);

        // Calculate the number of days until the first day of next month
        long daysUntilNextMonth = ChronoUnit.DAYS.between(today, firstDayOfNextMonth);

        // Display the result
        System.out.println("There are " + daysUntilNextMonth + " days until the first day of " +
                firstDayOfNextMonth.getMonth() + ".");
    }
}
