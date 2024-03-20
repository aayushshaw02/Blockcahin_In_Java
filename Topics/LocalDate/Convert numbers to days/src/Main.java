import java.time.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
       Scanner sc=new Scanner(System.in);
       int year=sc.nextInt();
       int d1=sc.nextInt();
       int d2=sc.nextInt();
       int d3=sc.nextInt();
       LocalDate l1=LocalDate.ofYearDay(year,d1);
        System.out.println(l1);
        LocalDate l2=LocalDate.ofYearDay(year,d2);
        System.out.println(l2);
        LocalDate l3=LocalDate.ofYearDay(year,d3);
        System.out.println(l3);
    }
}