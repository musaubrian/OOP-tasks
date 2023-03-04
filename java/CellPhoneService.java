import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int talkMins, texts, data;

        System.out.println("\nWelcome to Horizon Phones!");
        System.out.println("Please enter your maximum monthly usage for the following");

        System.out.print("Talk minutes used: ");
        talkMins = sc.nextInt();

        System.out.print("Text messages sent: ");
        texts = sc.nextInt();

        System.out.print("Gigabytes of data used: ");
        data = sc.nextInt();

        if (talkMins < 500 && texts == 0 && data == 0) {
            System.out.println("We recommend Plan A at $49 per month.");
        } else if (talkMins < 500 && texts > 0) {
            System.out.println("We recommend Plan B at $55 per month.");
        } else if (talkMins >= 500 && data == 0 && texts < 100) {
            System.out.println("We recommend Plan C for up to 100 text messages at $61 per month.");
        } else if (talkMins >= 500 && data == 0 && texts >= 100) {
            System.out.println("We recommend Plan D for 100 text messages or more at $70 per month.");
        } else if (data < 3) {
            System.out.println("We recommend Plan E for up to 3 gigabytes at $79 per month.");
        } else {
            System.out.println("We recommend Plan F for 3 gigabytes or more at $87 per month.");
        }

        sc.close();
    }
}
