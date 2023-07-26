import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10 };
        List<Integer> repeatedEvenNumbers = findRepeatedEvenNumbers(numbers);
        System.out.println("Tekrar eden çift sayılar: " + repeatedEvenNumbers);
    }

    public static List<Integer> findRepeatedEvenNumbers(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> numFrequency = new HashMap<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                numFrequency.put(num, numFrequency.getOrDefault(num, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
