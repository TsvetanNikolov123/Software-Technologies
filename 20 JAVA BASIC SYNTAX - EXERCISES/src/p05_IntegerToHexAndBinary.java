import java.util.Scanner;

public class p05_IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        String hex = Integer.toHexString(input).toUpperCase();
        String binaryNum = Integer.toBinaryString(input);

        System.out.println(hex);
        System.out.println(binaryNum);
    }
}
