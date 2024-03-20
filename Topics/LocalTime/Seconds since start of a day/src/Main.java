import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        LocalTime l=LocalTime.ofSecondOfDay(d);
        System.out.println(l);
    }
}