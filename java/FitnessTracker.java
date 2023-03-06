import java.time.LocalDate;

public class FitnessTracker {
    private String activity;
    private int minutes;
    private LocalDate date;

    public FitnessTracker() {
        this.activity = "running";
        this.minutes = 0;
        this.date = LocalDate.ofYearDay(LocalDate.now().getYear(), 1);
    }

    public FitnessTracker(String activity, int minutes, LocalDate date) {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }

    public String getActivity() {
        return activity;
    }

    public int getMinutes() {
        return minutes;
    }

    public LocalDate getDate() {
        return date;
    }
}
