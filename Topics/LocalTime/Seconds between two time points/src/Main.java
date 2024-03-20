import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        // write your code here
        LocalTime d1=LocalTime.parse(s1);
        LocalTime d2=LocalTime.parse(s2);
        int ans=Math.abs(d1.toSecondOfDay()-d2.toSecondOfDay());
        System.out.println(ans);
    }
}