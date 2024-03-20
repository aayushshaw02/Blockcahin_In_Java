import java.time.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int month=sc.nextInt();
        LocalDate l=LocalDate.of(year,month,1);
        LocalDate s=LocalDate.of(year,month,1).plusMonths(1).minusDays(1);
        System.out.print(l+" ");
        System.out.println(s);
    }
}