import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code[] = new int[7];
        boolean flag = true;

        for( int i = 0; i < code.length; i++ ) {
            code[i] = sc.nextInt();
        }

        sc.close();

        if( code[0] == 1 ) {
            for( int i = 0; i < code.length; i++ ) {
                if( code[i] != i+1 ) flag = false;
            }

            if( !flag ) System.out.println("mixed");

            else System.out.println("ascending");

        } else if( code[0] == 8 ) {
            for( int i = 0; i <code.length; i++ ) {
                if( i + code[i] != 8 ) flag = false;
            }
            
            if( !flag ) System.out.println("mixed");

            else System.out.println("descending");
            
        } else {
            System.out.println("mixed");
        }
    }
}