import java.util.Scanner;

public class ShadyRestRoom2 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                \n1 for a queen bed, 2 for a king, or 3 for a king and a pullout couch.\n""");
        System.out.print("Select a choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Price: $125");
        } else if (choice == 2) {
            System.out.println("Price: $139");
        } else if (choice == 3) {
            System.out.println("Price: $165");
        } else {
            System.out.println(choice + " is invalid");
            System.out.println("Exiting...");
            System.exit(0);
        }
        viewOption(sc, choice);
        sc.close();
    }

    public static void viewOption(Scanner sc, int choice) {
        int view;
        System.out.println("\nSelect a view option:\n1 for lake view\n2 for park view");
        view = sc.nextInt();
        if (view == 1) {
            if (choice == 1) {
                System.out.println("Price: $140");
            } else if (choice == 2) {
                System.out.println("Price: $154");
            } else if (choice == 3) {
                System.out.println("Price: $180");
            } else {
                System.out.println("Invalid bed size");
            }
        } else if (view == 2) {
            if (choice == 1) {
                System.out.println("Price: $125");
            } else if (choice == 2) {
                System.out.println("Price: $139");
            } else if (choice == 3) {
                System.out.println("Price: $165");
            } else {
                System.out.println("Invalid bed size");
            }
        } else {
            System.out.println("Invalid view option");
        }
    }
}
