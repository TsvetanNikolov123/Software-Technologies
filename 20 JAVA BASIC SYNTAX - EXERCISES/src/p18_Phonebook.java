import java.util.HashMap;
import java.util.Scanner;

public class p18_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> phonebook = new HashMap<>();

        while (true) {
            String[] input = scanner.nextLine()
                    .split("\\s");

            if (input[0].equals("END")) {
                break;
            }

            if (input[0].equals("A")) {
                if (!phonebook.containsKey(input[1])) {
                    phonebook.put(input[1],input[2]);
                }
                phonebook.replace(input[1], input[2]);
            } else {
                if (phonebook.containsKey(input[1])) {
                    String name = input[1];
                    String number = phonebook.get(input[1]);
                    System.out.printf("%s -> %s\n", name, number);
                } else {
                    String name = input[1];
                    System.out.printf("Contact %s does not exist.\n", name);
                }
            }
        }
    }
}
