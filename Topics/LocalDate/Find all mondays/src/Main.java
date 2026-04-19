import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        String[] combination = date.split(" ");
        int year = Integer.parseInt(combination[0]);
        int month = Integer.parseInt(combination[1]);
        LocalDate d = LocalDate.of(year,month,1);
        while (d.getDayOfWeek()!= DayOfWeek.MONDAY){
            d = d.plusDays(1);
        }

        while (d.getMonthValue() == month) {
            System.out.println(d);
            d = d.plusDays(7);
        }

    }
}