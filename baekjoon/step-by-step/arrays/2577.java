import java.util.Scanner;
import java.utli.Array;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idxArr[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        sc.close();

        int multi = num1 * num2 * num3;

        String tempNumber = Integer.toString(multi);
        int tempArr[] = new int[tempNumber.length()];

        for( int i=0; i<tempArr.length; i++) {
            tempArr[i] = tempNumber.charAt(i) -'0';
        }

        for(int i = 0; i<idxArr.length; i++) {
            for( int j = 0; j<tempArr.length; j++) {
                if( i == tempArr[j] ) idxArr[i] += 1 ;
            }
        }

        for(int i = 0; i<idxArr.length; i++) {   
            System.out.println(idxArr[i]);
        }
    }
}