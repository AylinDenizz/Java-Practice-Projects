import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number (N): ");
        int n = input.nextInt();

        operateNumber(n);
    }

    public static void operateNumber(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        if (n - 5 > 0) {
            operateNumber(n - 5);
        } else {
            operateNumber(n + 5);
        }
    }
}
