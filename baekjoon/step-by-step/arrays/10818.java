import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Number of Elements
        int arr[] = new int[n]; // Initialize Array

        for( int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Input Data
        }

        int minArr = arr[0];
        int maxArr = arr[0];

        for( int i = 0; i < arr.length; i ++) {
            if( minArr > arr[i] ) minArr = arr[i];
            if( maxArr < arr[i] ) maxArr = arr[i];
        }

        System.out.printf("%d %d", minArr, maxArr);
        
    }
}