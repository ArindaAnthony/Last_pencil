import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int days1 = sc.nextInt();
        int days2 = sc.nextInt();
        int days3 = sc.nextInt();
        LocalDate d1 = LocalDate.ofYearDay(year, days1);
        LocalDate d2 = LocalDate.ofYearDay(year, days2);
        LocalDate d3 = LocalDate.ofYearDay(year, days3);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}