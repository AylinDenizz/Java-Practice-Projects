import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5.00;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many kg apple you want?");
        double appleAmount = scanner.nextDouble();
        System.out.println("How many kg pear you want?");
        double pearAmount = scanner.nextDouble();
        System.out.println("How many kg tomato you want?");
        double tomatoAmount = scanner.nextDouble();
        System.out.println("How many kg banana you want?");
        double bananaAmount = scanner.nextDouble();
        System.out.println("How many kg eggplant you want?");
        double eggplantAmount = scanner.nextDouble();

        double totalPrice = pearAmount*pear + eggplantAmount*eggplant + tomatoAmount*tomato +
                banana*bananaAmount + appleAmount*apple;
        System.out.println("total price :" + totalPrice);


    }
}