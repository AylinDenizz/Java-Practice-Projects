import java.util.Arrays;

public class ClosestNumbers {

    public static void findClosestNumbers(int[] arr, int target) {
        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < target && num > closestSmaller) {
                closestSmaller = num;
            } else if (num > target && num < closestLarger) {
                closestLarger = num;
            }
        }

        System.out.println("Dizi: " + Arrays.toString(arr));
        System.out.println("Girilen Sayı: " + target);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
    }

    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        int inputNumber = 5;

        findClosestNumbers(array, inputNumber);
    }
}
