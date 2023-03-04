import java.util.Scanner;

public class TestApartments {
    public static void main(String[] args) {
        Apartment[] apartments = {
                new Apartment(101, 3, 2, 12000),
                new Apartment(112, 2, 2, 6000),
                new Apartment(241, 4, 3, 20000),
                new Apartment(202, 1, 1, 3500),
                new Apartment(301, 2, 1, 7000)
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Minimum number of bedrooms required: ");
        int minBedrooms = sc.nextInt();
        System.out.print("Minimum number of baths required: ");
        int minBaths = sc.nextInt();
        System.out.print("Maximum rent you are willing to pay: ");
        double maxRent = sc.nextDouble();

        boolean foundApartment = false;
        for (Apartment apt : apartments) {
            if (apt.getNumOfBedrooms() >= minBedrooms &&
                    apt.getNumOfBaths() >= minBaths &&
                    apt.getRent() <= maxRent) {
                System.out.println("Apartment " + apt.getApartmentNumber() +
                        " with " + apt.getNumOfBedrooms() +
                        " bedroom(s), " + apt.getNumOfBaths() +
                        " bath(s), and rent of $" + apt.getRent() +
                        " meets your criteria.");
                foundApartment = true;
            }
        }

        if (!foundApartment) {
            System.out.println("Sorry, no apartments are available that meet your criteria.");
        }
        sc.close();
    }
}
