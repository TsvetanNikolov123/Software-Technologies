import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class p11_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Boolean isFindEqualSums = false;

        for (int i = 0; i < numbers.length; i++)
        {
            int[] leftSide = Arrays
                    .stream(numbers)
                    .limit(i)
                    .toArray();

            int[] rightSide = Arrays
                    .stream(numbers)
                    .skip(i + 1)
                    .toArray();

            int leftSum = IntStream.of(leftSide).sum();
            int rightSum = IntStream.of(rightSide).sum();

            if (leftSum == rightSum)
            {
                System.out.println(i);
                isFindEqualSums = true;
                break;
            }
        }

        if (!isFindEqualSums)
        {
            System.out.println("no");
        }
    }
}
