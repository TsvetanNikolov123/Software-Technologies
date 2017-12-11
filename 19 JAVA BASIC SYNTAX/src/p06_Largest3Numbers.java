import java.util.Arrays;
import java.util.Scanner;

public class p06_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("\\s");
        int[] intArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(intArr);

        int count = 0;
        for (int i = intArr.length - 1; i >= 0 ; i--) {
            if (count == 3){
                break;
            }
            System.out.println(intArr[i]);
            count++;
        }
    }
}
