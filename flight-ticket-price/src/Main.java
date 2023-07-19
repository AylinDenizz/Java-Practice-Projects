import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerDistance = 0.1 ;
        double discount = 0;

        System.out.println("please enter your age.");
        int age = scanner.nextInt();
        System.out.println("please enter your flight distance.");
        double distance = scanner.nextDouble();
        System.out.println("please enter your flight type (1 or 2).");
        String flightType = scanner.next();

        double normalPrice = pricePerDistance * distance
        if (flightType == "1") {

            if (age < 12) {
                discount = normalPrice * 0.5;
            }else if (age > 65) {
                discount = normalPrice * 0.3;
            } else if (age>12 && age<24) {
                discount = normalPrice * 0.1;
            } else {
                discount = 0;
        } }
        else if (flightType == "2") {
            if (age < 12) {
                discount = normalPrice * 0.5 + normalPrice * 0.2;
            }else if (age > 65) {
                discount = normalPrice * 0.3 + normalPrice * 0.2;
            } else if (age>12 && age<24) {
                discount = normalPrice * 0.1 + normalPrice * 0.2;
            } else {
                discount = 0 + normalPrice * 0.2;
            }

        } else {
            System.out.println("You Entered Wrong Data!");
        }

        double totalPrice = normalPrice - discount;

        System.out.println("the amount you will pay: " + (totalPrice));

    }
}