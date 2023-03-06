public class Billing {
    public static double computeBill(double price) {
        double total = price + (price * 0.08);
        return total;
    }

    public static double computeBill(double price, int quantity) {
        double total = (price * quantity) + ((price * quantity) * 0.08);
        return total;
    }

    public static double computeBill(double price, int quantity, double couponValue) {
        double subtotal = (price * quantity) - couponValue;
        double total = subtotal + (subtotal * 0.08);
        return total;
    }

    public static void main(String[] args) {
        // Test the first method
        System.out.println("Total due (single parameter): " + computeBill(19.99));

        // Test the second method
        System.out.println("Total due (two parameters): " + computeBill(19.99, 3));

        // Test the third method
        System.out.println("Total due (three parameters): " + computeBill(19.99, 3, 5.00));
    }
}
