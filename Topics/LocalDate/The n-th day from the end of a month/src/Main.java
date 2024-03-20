import java.time.LocalDate;
import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int month=sc.nextInt();
        int day=sc.nextInt();
        LocalDate l=LocalDate.of(year,month,1).plusMonths(1).minusDays(day);
        System.out.println(l);
    }
}