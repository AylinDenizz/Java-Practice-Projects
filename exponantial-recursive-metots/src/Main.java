import java.util.Scanner;

public class RecursivePower {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base value: ");
        int base = input.nextInt();

        System.out.print("Enter the exponent value: ");
        int exponent = input.nextInt();

        int result = calculatePower(base, exponent);
        System.out.println("Result: " + result);
    }

    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * calculatePower(base, exponent - 1);
        }
    }
}
