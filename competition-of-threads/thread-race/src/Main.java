import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            arr.add(i);
        }

        List<Integer> part1 = arr.subList(0, 2500);
        List<Integer> part2 = arr.subList(2500, 5000);
        List<Integer> part3 = arr.subList(5000, 7500);
        List<Integer> part4 = arr.subList(7500, 10000);

        Count thread1 = new Count(part1, "Thread 1");
        Count thread2 = new Count(part2, "Thread 2");
        Count thread3 = new Count(part3, "Thread 3");
        Count thread4 = new Count(part4, "Thread 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}