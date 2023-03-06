import java.time.LocalDate;

public class TestFitnessTracker {
    public static void main(String[] args) {
        FitnessTracker tracker1 = new FitnessTracker();
        FitnessTracker tracker2 = new FitnessTracker("swimming", 30, LocalDate.of(2022, 3, 6));

        System.out.println("Tracker 1 activity: " + tracker1.getActivity());
        System.out.println("Tracker 1 minutes: " + tracker1.getMinutes());
        System.out.println("Tracker 1 date: " + tracker1.getDate());

        System.out.println("Tracker 2 activity: " + tracker2.getActivity());
        System.out.println("Tracker 2 minutes: " + tracker2.getMinutes());
        System.out.println("Tracker 2 date: " + tracker2.getDate());
    }
}
