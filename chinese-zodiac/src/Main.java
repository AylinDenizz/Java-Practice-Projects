
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        String chineseZodiac = calculateChineseZodiac(birthYear);
        System.out.println("Your Chinese Zodiac sign: " + chineseZodiac);
    }

    public static String calculateChineseZodiac(int birthYear) {
        String[] chineseZodiacSigns = {
                "Monkey", "Rooster", "Dog", "Pig",
                "Rat", "Ox", "Tiger", "Rabbit",
                "Dragon", "Snake", "Horse", "Sheep"
        };

        int index = birthYear % 12;

        return chineseZodiacSigns[index];
    }
}
