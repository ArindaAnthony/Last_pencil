import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        LocalTime time = LocalTime.parse(sc.nextLine());
        String offset = sc.nextLine();
        int hours = Integer.parseInt(offset.split(" ")[0]);
        int minutes = Integer.parseInt(offset.split(" ")[1]);

        time = time.minusHours(hours).minusMinutes(minutes);
        System.out.println(time);
    }
}