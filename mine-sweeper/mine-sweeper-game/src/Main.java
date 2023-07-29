import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Satırdan Oluşmasını İstediğinizi Giriniz : ");
        int rows = scanner.nextInt();
        System.out.print("Kaç Sütundan Oluşmasını İstediğinizi Giriniz : ");
        int cols = scanner.nextInt();
        MineSweeper game = new MineSweeper(rows, cols);
        game.play();
    }
}