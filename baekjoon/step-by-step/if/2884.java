import java.util.*;

public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        sc.close();

        if( min - 45 < 0 ) {
            hour = hour - 1;
            min = (60 + min) - 45;

            if( hour < 0 ) {
                hour += 24;
            }
        } else {
            min = min - 45;
        }

        System.out.println(hour + " " + min);
    }
}