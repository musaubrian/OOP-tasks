import java.util.Scanner;

public class ShadyRestRoom {
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
        }
        sc.close();
    }
}
