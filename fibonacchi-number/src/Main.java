import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int n = input.nextInt();

        System.out.println("Fibonacci Series:");
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}
