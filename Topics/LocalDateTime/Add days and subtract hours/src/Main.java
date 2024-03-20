import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        LocalDateTime l=LocalDateTime.parse(s);
        int d=sc.nextInt();
        int h=sc.nextInt();
        System.out.println(l.plusDays(d).minusHours(h));
    }
}