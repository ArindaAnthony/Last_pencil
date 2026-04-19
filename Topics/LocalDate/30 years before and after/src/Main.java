import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        LocalDate d = LocalDate.parse(sc.nextLine());
        LocalDate d1 = d.plusYears(30);
        LocalDate d2 = d.minusYears(30);
        System.out.println(d2);
        System.out.println(d1);
    }
}