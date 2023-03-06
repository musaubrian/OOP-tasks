import java.lang.Math;

public class MathTest {
    public static void main(String[] args) {
        // a. The square root of 37
        System.out.println("The square root of 37: " + Math.sqrt(37));

        // b. The sine and cosine of 300
        System.out.println("The sine of 300: " + Math.sin(300));
        System.out.println("The cosine of 300: " + Math.cos(300));

        // c. The value of the floor, ceiling, and round of 22.8
        System.out.println("The floor of 22.8: " + Math.floor(22.8));
        System.out.println("The ceiling of 22.8: " + Math.ceil(22.8));
        System.out.println("The round of 22.8: " + Math.round(22.8));

        // d. The larger and the smaller of the character ‘D’ and the integer 71
        char c = 'D';
        int i = 71;
        System.out.println("The larger of " + c + " and " + i + ": " + Math.max(c, i));
        System.out.println("The smaller of " + c + " and " + i + ": " + Math.min(c, i));

        // e. A random number between 0 and 20
        System.out.println("A random number between 0 and 20: " + Math.random() * 20);
    }
}