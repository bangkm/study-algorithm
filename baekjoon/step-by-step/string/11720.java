import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        int result = 0;
        int n = sc.nextInt();
        String str = sc.next();
        
        if( n == str.length() ) {
            for( int i = 0; i<str.length(); i++ ) {
                result += (int)str.charAt(i) -'0';
            }
        }

        System.out.println(result);
        sc.close();
    }
}