import java.util.Scanner;

public class p03_3IntegersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (!checkTreeIntegers(num1, num2, num3) &&
                !checkTreeIntegers(num3, num1, num2) &&
                !checkTreeIntegers(num2, num3, num1))
            System.out.println("No");
    }

    private static boolean checkTreeIntegers(int num1, int num2, int sum) {
        if (num1 + num2 != sum) {
            return false;
        }

        if (num1 <= num2) {
            System.out.printf("%d + %d = %d%n", num1, num2, sum);
        } else {
            System.out.printf("%d + %d = %d%n", num2, num1, sum);
        }
        return true;
    }
}
