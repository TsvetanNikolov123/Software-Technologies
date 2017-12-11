import java.util.Scanner;

public class p04_VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int ascii = (int)input.charAt(0);

        if (ascii > 47 && ascii < 58) {
            System.out.println("digit");
        } else if (input.equals("a") ||
                input.equals("e") ||
                input.equals("o") ||
                input.equals("i") ||
                input.equals("u")){
            System.out.println("vowel");
        } else  {
            System.out.println("other");
        }
    }
}
