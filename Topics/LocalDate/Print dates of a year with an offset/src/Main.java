import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.parse("00:05").withMinute(5);
        System.out.println(time);
    }
}