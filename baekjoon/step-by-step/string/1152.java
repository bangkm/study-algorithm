import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        String str = sc.nextLine();

        StringTokenizer strToken = new StringTokenizer(str, " ");

        // String[] trimStr = str.trim().split(" ");

        System.out.println(strToken.countTokens());

        // for( int i = 0; i < trimStr.length; i++ ) {
        //     System.out.println(trimStr[i]);
        // }

        sc.close();

    }
}

// The Curious Case of Benjamin Button
//  Mazatneunde Wae Teullyeoyo
// Teullinika Teullyeotzi 