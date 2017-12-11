import java.util.Scanner;

public class p15_CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        String text = scanner.nextLine();

        String[] emailParts = email.split("@");
        String userName = emailParts[0];
        String replacedUsername = "";

        for (int i = 0; i < userName.length(); i++) {
            replacedUsername += "*";
        }

        String hiddenUserName = replacedUsername + "@" + emailParts[1];

        System.out.println(text.replace(email, hiddenUserName));
    }
}
