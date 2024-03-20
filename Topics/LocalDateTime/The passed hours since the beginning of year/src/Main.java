import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        LocalDateTime l=LocalDateTime.parse(s);
        LocalDateTime t=LocalDateTime.of(l.getYear(),1,1,0,0);
        int day=l.getDayOfYear()-t.getDayOfYear();
        int time=day*24;
        int hour=l.getHour()-t.getHour();
        time+=hour;
        System.out.println(time);
    }
}