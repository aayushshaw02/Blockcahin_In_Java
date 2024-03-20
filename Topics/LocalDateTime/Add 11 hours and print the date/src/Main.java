import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String date=sc.next();
        LocalDateTime l=LocalDateTime.parse(date);
        LocalDate d=l.plusHours(11).toLocalDate();
        System.out.println(d);
    }
}