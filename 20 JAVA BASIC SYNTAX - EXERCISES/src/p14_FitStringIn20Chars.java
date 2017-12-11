import java.util.Scanner;

public class p14_FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] inputAsChars = input.toCharArray();

        for (int i = 0; i < 20; i++) {
            if (inputAsChars.length > i) {
                System.out.printf("%c", inputAsChars[i]);
            }else {
                System.out.print("*");
            }
        }
    }
}
