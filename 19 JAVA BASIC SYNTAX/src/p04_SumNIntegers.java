import java.util.Scanner;

public class p04_SumNIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long sumOfNums = 0;

        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(scanner.nextLine());
            sumOfNums += num;
        }

        System.out.printf("Sum = %d", sumOfNums);
    }
}
