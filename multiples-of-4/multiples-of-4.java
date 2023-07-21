import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input;

        do {
            System.out.print("Bir sayı giriniz (Programı sonlandırmak için 0'a basın): ");
            input = scanner.nextInt();

            if (input % 2 == 0 && input % 4 == 0) {
                sum += input;
            }
        } while (input != 0);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + sum);
    }
}
