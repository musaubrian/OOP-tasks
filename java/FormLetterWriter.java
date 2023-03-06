public class FormLetterWriter {
    public static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName + ",");
        System.out.println("Thank you for your recent order.");
    }

    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
        System.out.println("Thank you for your recent order.");
    }

    public static void main(String[] args) {
        // Test the first method
        displaySalutation("Doe");

        // Test the second method
        displaySalutation("John", "Doe");
    }
}
