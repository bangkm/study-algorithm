import java.util.*;

public class Solution {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        String str = sc.nextLine();
        int result = 0;

        for( int i = 0; i < str.length(); i++ ) {
            int currentChar = str.charAt(i) - 65;

            switch (currentChar) {
                case 0:
                case 1:
                case 2:
                    result += 3;
                    break;
                
                case 3:
                case 4:
                case 5:
                    result += 4;
                    break;
                
                case 6:
                case 7:
                case 8:
                    result += 5;
                    break;
                
                case 9:
                case 10:
                case 11:
                    result += 6;
                    break;

                case 12:
                case 13:
                case 14:
                    result += 7;
                    break;

                case 15:
                case 16:
                case 17:
                case 18:
                    result += 8;
                    break;

                case 19:
                case 20:
                case 21:
                    result += 9;
                    break;

                case 22:
                case 23:
                case 24:
                case 25:
                    result += 10;
                    break;

                default:
                    break;
            }
        }

        System.out.println(result);
    }
}