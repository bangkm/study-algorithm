import java.util.*;

public class Solution {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );

        int n = sc.nextInt();
        String arr[] = new String[n];
        
        for( int i = 0; i<arr.length; i++) {
            arr[i] = sc.next();
        }

        sc.close();

        for( int i = 0; i<n; i++ ) {
            char[] arr2 = new char[arr[i].length()];
            int pass = 0;
            int total = 0;
            
            for( int j = 0; j<arr2.length; j++) {
                arr2[j] = arr[i].charAt(j);
            }

            for( int j = 0; j<arr2.length; j++ ) {
                if (arr2[j] == 'O') {
                    pass += 1;
                    total += pass;
                } else {
                    pass = 0;
                }
            }

            System.out.println(total);
        }
    }
}