import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        LocalTime l=LocalTime.parse(s);
        LocalTime d=LocalTime.of(l.getHour(),l.getMinute());
        System.out.println(d);
    }
}