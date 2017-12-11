import java.util.Scanner;

public class p10_IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] input = scanner.nextLine().toCharArray();

        for (char c : input) {
            int charIndex = alphabet.indexOf(c);
            System.out.printf("%c -> %d%n", c, charIndex);

        }
    }
}
