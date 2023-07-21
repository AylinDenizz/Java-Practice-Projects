import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number?");
            int enteredNumber = scanner.nextInt();
            int total = 0;
            for ( int i = 1; i < enteredNumber; i++){
                if (enteredNumber % i == 0) {
                    total = total + i;
                }
            }
            if (total == enteredNumber) {
                System.out.println(enteredNumber + " mükemmel bir sayıdır.");
            }
            else if (total != enteredNumber) {
                System.out.println(enteredNumber + " mükemmel bir sayı değildir.");
            }
        }
    }
}