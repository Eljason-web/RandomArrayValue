import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] numbers = new int[15];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
        numbers[i] = -20 + random.nextInt(41);
    }
        System.out.println("Random array: ");
        for (int num : numbers) {
            System.out.print(num + ",");
        }
        System.out.println();

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int positiveCount = 0;

        for (int num : numbers) {
            if (num < min)
                min = num;

            if (num > max)
                max = num;

            sum += num;  // Add to sum

            if (num < 0) {
                negativeCount++;
            }else if (num > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }

        }
        double average = (double) sum / numbers.length;

        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers);

        System.out.println("\nSorted array (ascending):");
        for (int num : sortedNumbers) {
            System.out.println(num + ",");
        }
        System.out.println();


        System.out.println("\n ___Summary___ ");
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("zeroCount: " + zeroCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of positive numbers: " + positiveCount);
    }
}