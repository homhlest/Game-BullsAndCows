
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * This method checks user input.
 * If the input is incorrect, the user sees a corresponding message.
 */

public class Input {

    public static String[] check(){
        Scanner sc = new Scanner(System.in);
        String[] number = sc.nextLine().split("");
        while (!isDigitsAllDifferent(number)) {
            System.out.println("There should be 4 different digits. Try again.");
            number = sc.nextLine().split("");
        }
        return number;
    }

    public static boolean isDigitsAllDifferent(String[] input) {
        Set<String> checker = new HashSet<>(Arrays.asList(input));
        return checker.size() == 4;
    }
}
