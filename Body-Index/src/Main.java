import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height (as meter:)");
        int height = scanner.nextInt();
        System.out.println("Please enter your weight (as kg:)");
        int weight = scanner.nextInt();
        int bodyIndex = (weight)/((height) * (height));
        System.out.println(bodyIndex));