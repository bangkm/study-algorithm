import java.util.*;

public class Solution {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        for(int i = 97; i<123; i++) {
            char asciiChar = (char)i;
            
            for(int j=0; j<str.length(); j++) {
                char charStr = str.charAt(j);
                if( charStr == asciiChar ) {
                    System.out.print(j + " ");
                    break;
                } else if( j == str.length()-1 ) {
                    System.out.print(-1 + " ");
                }
            }
        }

        input.close();
    }
}