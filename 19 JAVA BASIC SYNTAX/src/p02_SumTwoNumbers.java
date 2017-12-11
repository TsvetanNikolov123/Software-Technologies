import java.util.Scanner;

public class p02_SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());
        double result = firstNum + secondNum;

        System.out.println(result);
    }
}
