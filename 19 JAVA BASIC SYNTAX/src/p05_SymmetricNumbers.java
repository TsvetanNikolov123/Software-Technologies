import java.util.Scanner;

public class p05_SymmetricNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            if (isSymmetric(i)){
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isSymmetric(int i) {

        String tmp = Integer.toString(i);
        String inputToSting = new StringBuilder(tmp).reverse().toString();
        if (tmp.equals(inputToSting)){
            return true;
        }
        return false;
    }
}
