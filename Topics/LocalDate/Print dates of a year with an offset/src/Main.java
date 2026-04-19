import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        LocalDate d1 = LocalDate.parse(sc.nextLine());
        int offset = sc.nextInt();
        int year = d1.getYear();
        while (d1.getYear()==year){
            System.out.println(d1);
            d1 = d1.plusDays(offset);
        }
    }
}