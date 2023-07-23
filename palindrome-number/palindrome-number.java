import java.util.Scanner;

public class PalindromikSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        if (isPalindromic(number)) {
            System.out.println(number + " bir palindromik sayıdır.");
        } else {
            System.out.println(number + " bir palindromik sayı değildir.");
        }

        scanner.close();
    }

    // Palindromik sayıyı kontrol eden fonksiyon
    public static boolean isPalindromic(int number) {
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}
