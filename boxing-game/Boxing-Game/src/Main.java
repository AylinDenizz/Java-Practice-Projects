import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Random random = new Random();
        int numb = random.nextInt(100);
        Fighter firstfighter = new Fighter();
        Fighter secondfighter = new Fighter();
        if (numb <= 50) {
             firstfighter = marc;
             secondfighter = alex;
            System.out.println("Marc is the first attacker");
        } else {
            firstfighter = alex;
            secondfighter = marc;
            System.out.println("Alex is the first attacker");
        }
        Ring r = new Ring(firstfighter,secondfighter , 90 , 100);
        r.run();
    }
}

