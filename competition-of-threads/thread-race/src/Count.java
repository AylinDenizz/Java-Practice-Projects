import java.util.ArrayList;
import java.util.List;

public class Count extends Thread {
    private List<Integer> numbers;
    private String threadName;
    private  List<Integer> oddNumbers;
    private  List<Integer> evenNumbers;


    public Count(List<Integer> numbers, String threadName) {
        this.numbers = numbers;
        this.threadName = threadName;
        this.oddNumbers = new ArrayList<>();
        this.evenNumbers = new ArrayList<>();
    }

    @Override
    public void run() {

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                synchronized (evenNumbers) {
                    System.out.println(Thread.currentThread().getName());
                    evenNumbers.add(number);
                    System.out.println(" even" + number);
                }
            } else {
                synchronized (oddNumbers) {
                }
                System.out.println(Thread.currentThread().getName());
                oddNumbers.add(number);
                System.out.println(" odd" + number);
            }
        }
        System.out.println(threadName + " finished analyzing.");
    }

    public List<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public List<Integer> getEvenNumbers() {
        return evenNumbers;
    }
}

