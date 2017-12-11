import java.util.Scanner;
import java.util.TreeMap;

public class p19_PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, String> phonebook = new TreeMap<>();
        String input = "";

        while (!(input = scanner.nextLine()).equals("END")) {
            String[] data = input.split("\\s");

            switch (data[0]) {
                case "A": {
                    String name = data[1];
                    String phoneNumber = data[2];

                    if (!phonebook.containsKey(name)) {
                        phonebook.put(name, "");
                    }
                    phonebook.put(name, phoneNumber);
                    break;
                }
                case "S": {
                    String name = data[1];

                    if (phonebook.containsKey(name)) {
                        System.out.printf("%s -> %s\n", name, phonebook.get(name));
                    } else {
                        System.out.printf("Contact %s does not exist.\n", name);
                    }
                    break;
                }
                case "ListAll": {
                    for (String name : phonebook.keySet()) {
                        System.out.println(name + " -> " + phonebook.get(name));
                    }
                    break;
                }
                default:
                    break;
            }
        }
    }
}
