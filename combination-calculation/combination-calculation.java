import java.util.Scanner;

public class Main {

    // Faktöriyel hesaplama metodu
    public static int faktoriyel(int sayi) {
        if (sayi == 0 || sayi == 1) {
            return 1;
        } else {
            return sayi * faktoriyel(sayi - 1);
        }
    }

    // Kombinasyon hesaplama metodu
    public static int kombinasyon(int n, int r) {
        int kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        return kombinasyon;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();

        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();

        scanner.close();

        if (n < 0 || r < 0 || n < r) {
            System.out.println("Hatalı giriş! n ve r pozitif tamsayılar olmalı ve n >= r olmalıdır.");
        } else {
            int sonuc = kombinasyon(n, r);
            System.out.println("C(" + n + "," + r + ") = " + sonuc);
        }
    }
}
