public class Main {
          public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of steps: ");
        int steps = input.nextInt();

        drawInvertedTriangle(steps);
    }

    public static void drawInvertedTriangle(int steps) {
        for (int i = steps; i >= 1; i--) {
            // Print leading spaces
            for (int j = 0; j < steps - i; j++) {
                System.out.print(" ");
            }
            
            // Print asterisks
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}

