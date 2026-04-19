import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LocalTime time = LocalTime.parse(s);
        System.out.println(time.withSecond(0));
        /*String[] split = s.split(":");
        System.out.println(split[0]+":"+split[1]);*/
    }
}