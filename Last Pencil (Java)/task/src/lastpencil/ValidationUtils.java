package lastpencil;
import java.util.Scanner;
public class ValidationUtils {
    public static int getValidPencils(Scanner sc) {
        while (true) {
            String input = sc.nextLine();

            if (!input.matches("\\d+")) {
                System.out.println("The number of pencils should be numeric");
                continue;
            }

            int num = Integer.parseInt(input);

            if (num <= 0) {
                System.out.println("The number of pencils should be positive");
                continue;
            }

            return num;
        }
    }

    public static String getValidPlayer(Scanner sc) {
        while (true) {
            String player = sc.nextLine();

            if (player.equals("John") || player.equals("Jack")) {
                return player;
            }

            System.out.println("Choose between 'John' and 'Jack'");
        }
    }

    public static int getValidMove(Scanner sc, int pencils) {
        while (true) {
            String input = sc.nextLine();

            if (!input.matches("\\d+")) {
                System.out.println("Possible values: '1', '2' or '3'");
                continue;
            }

            int move = Integer.parseInt(input);

            if (move < 1 || move > 3) {
                System.out.println("Possible values: '1', '2' or '3'");
                continue;
            }

            if (move > pencils) {
                System.out.println("Too many pencils were taken");
                continue;
            }

            return move;
        }
    }
}
