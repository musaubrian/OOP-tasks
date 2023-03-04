import java.util.Scanner;

public class AcmePay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hours, shift;
        boolean retirement;
        double rate, regularPay, overtimePay, netPay;

        System.out.println("Enter hours worked:");
        hours = sc.nextInt();
        System.out.println("Enter shift (1 = first, 2 = second, 3 = third):");
        shift = sc.nextInt();
        System.out.println("Does the worker elect the retirement plan? (true/false):");
        retirement = sc.nextBoolean();

        if (shift == 1) {
            rate = 17;
        } else if (shift == 2) {
            rate = 18.5;
        } else {
            rate = 22;
        }

        if (hours > 40) {
            regularPay = 40 * rate;
            overtimePay = (hours - 40) * 1.5 * rate;
        } else {
            regularPay = hours * rate;
            overtimePay = 0;
        }

        double retirementDeduction = 0;
        if (shift == 2 || shift == 3) {
            retirementDeduction = regularPay * 0.03;
        }

        netPay = regularPay + overtimePay - retirementDeduction;

        System.out.println("Hours worked: " + hours);
        System.out.println("Shift: " + shift);
        System.out.println("Hourly pay rate: $" + rate);
        System.out.println("Regular pay: $" + regularPay);
        System.out.println("Overtime pay: $" + overtimePay);
        System.out.println("Total pay: $" + (regularPay + overtimePay));
        if (retirement) {
            System.out.println("Retirement deduction: $" + retirementDeduction);
        } else {
            System.out.println("Retirement deduction: none");
        }
        System.out.println("Net pay: $" + netPay);

        sc.close();
    }
}
