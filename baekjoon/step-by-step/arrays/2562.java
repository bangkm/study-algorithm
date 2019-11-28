import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for( int i = 0; i<arr.length; i++ ) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int min = arr[0];
        int max = arr[0];

        for( int i = 0; i<arr.length; i++ ) {
            if( min > arr[i] ) min = arr[i];
            if( max < arr[i] ) max = arr[i];
        }

        for( int i = 0; i<arr.length; i++ ) {
            if( max == arr[i] ) {
                System.out.println(arr[i]);
                System.out.println(i+1);
            }
        }
    }
}