package lastpencil;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many pencils would you like to use:");
        int pencils = ValidationUtils.getValidPencils(sc);

        System.out.println("Who will be the first (John, Jack):");
        String player = ValidationUtils.getValidPlayer(sc);

        String bot = player.equals("John") ? "Jack" : "John";
        boolean isHumanTurn = player.equals("John"); // assume John = human

        while (pencils > 0) {
            System.out.println("|".repeat(pencils));

            if (isHumanTurn) {
                System.out.println(player + "'s turn!");
                int taken = ValidationUtils.getValidMove(sc, pencils);
                pencils -= taken;
            } else {
                System.out.println(bot + "'s turn!");
                int taken = getBotMove(pencils);
                System.out.println(taken);
                pencils -= taken;
            }

            isHumanTurn = !isHumanTurn;
        }

        // Winner (last player loses)
        if (isHumanTurn) {
            System.out.println(bot + " won!");
        } else {
            System.out.println(player + " won!");
        }
    }

    // 🤖 Smart bot
    public static int getBotMove(int pencils) {
        int move = pencils % 4;
        return (move == 0) ? 1 : move;
    }
}
