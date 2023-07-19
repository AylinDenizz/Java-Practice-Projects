import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("ilk Sayıvı Giriniz: ");

        n1 = input.nextInt();

        System.out.print("Ikinci Sayıya Giriniz : ");

        n2 = input.nextInt();

        System.out.println("1-Toplama \n2-Cakarma \n3-Carpma\n4-Bölme");

        System.out.print("Seçiminiz: ");

        select = input.nextInt();

        if (select == 1) {

            System.out.println("Toplam :" + (n1 + n2));

        } else if (select == 2) {

            System.out.println("Cikarma :" + (n1 - n2));
        } else if (select == 3) {

            System.out.println("Carpma :" + (n1 * n2));

        } else if (select == 4) {

            if (n2 != 0) {
                System.out.println("Bölme:" + (n1 / n2);
            } else {
                System.out.println("Bir sayı 8'a bölünenez !");
            }
        } else {

            System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
        }

    }
}
}