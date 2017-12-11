import java.util.Arrays;
import java.util.Scanner;

public class p09_MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays
                .stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] counts = new int[65535];
        int maxCount = 0;
        int frequentNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
            if (counts[nums[i]] > maxCount) {
                maxCount = counts[nums[i]];
                frequentNumber = nums[i];
            }
        }

        System.out.println(frequentNumber);
    }
}
