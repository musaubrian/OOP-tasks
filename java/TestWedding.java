import java.time.LocalDate;

public class TestWedding {
    public static void main(String[] args) {
        // Create two Person objects
        Person person1 = new Person("John", "Doe", LocalDate.of(1985, 5, 15));
        Person person2 = new Person("Jane", "Smith", LocalDate.of(1990, 10, 1));

        // Create a Couple object with the two Person objects
        Couple couple1 = new Couple(person1, person2);

        // Create a Wedding object with a date, the Couple, and a location
        Wedding wedding1 = new Wedding(LocalDate.of(2023, 6, 17), couple1, "The Grand Hotel");

        // Create another Couple object with two different Person objects
        Person person3 = new Person("Jack", "Knorris", LocalDate.of(1998, 3, 21));
        Person person4 = new Person("Jill", "Smith", LocalDate.of(1995, 9, 8));
        Couple couple2 = new Couple(person3, person4);

        // Create another Wedding object with a different date, the second Couple, and a
        // different location
        Wedding wedding2 = new Wedding(LocalDate.of(2024, 8, 23), couple2, "The Beach Club");

        // Call a method to display the details of both weddings
        displayWeddingDetails(wedding1);
        displayWeddingDetails(wedding2);
    }

    public static void displayWeddingDetails(Wedding wedding) {
        // Get the wedding details
        LocalDate weddingDate = wedding.getWeddingDate();
        Couple couple = wedding.getCouple();
        String location = wedding.getLocation();
        Person person1 = couple.getPerson1();
        Person person2 = couple.getPerson2();
        System.out.println("Wedding Details:");
        System.out.println(
                "Date: " + weddingDate.getMonth() + " " + weddingDate.getDayOfMonth() + ", " + weddingDate.getYear());
        System.out.println("Location: " + location);
        System.out.println("Couple:");
        System.out.println(person1.getFirstName() + " " + person1.getLastName() + " and " + person2.getFirstName() + " "
                + person2.getLastName());
        System.out.println();
    }
}
