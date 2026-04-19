import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();

        try{
            LocalDate localDate = LocalDate.parse(date);
            LocalDate days = localDate.minusDays(10);
            System.out.println(days);
        }catch(Exception e){
            System.out.println("Invalid date");
        }
    }
}