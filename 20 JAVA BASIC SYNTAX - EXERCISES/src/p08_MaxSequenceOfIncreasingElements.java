import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p08_MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays
                .stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayList<Integer> longestSeq = getLongestSequence(nums);
        System.out.println(String.join(" ", longestSeq.toString().replaceAll("\\[|\\,|\\]", "")));

    }

    private static ArrayList<Integer> getLongestSequence(int[] numbers) {
        int maxLen = 1;
        int maxIndex = 0;
        int currentLen = 1;
        int currentIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                currentLen++;
            } else {
                currentIndex = i;
                currentLen = 1;
            }
            if (maxLen < currentLen) {
                maxLen = currentLen;
                maxIndex = currentIndex;
            }
        }

        ArrayList<Integer> longestSeq = new ArrayList<>();
        for (int i = 0; i < maxLen; i++) {
            longestSeq.add(numbers[maxIndex + i]);
        }

        return longestSeq;
    }
}
