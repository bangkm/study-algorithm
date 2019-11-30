import java.util.*;

public class Solution {
    public static void main( String[] args) {
        Scanner sc = new Scanner( System.in );
        String str = sc.nextLine().toUpperCase();
        int alphaCnt[] = new int[26];
        int maxCnt = 0;
        char result = '?';

        for( int i = 0; i < str.length(); i++ ) {
            alphaCnt[str.charAt(i) - 65]++;
            if( maxCnt < alphaCnt[str.charAt(i) - 65] ) {
                result = str.charAt(i);
                maxCnt = alphaCnt[str.charAt(i) - 65];
            } else if( maxCnt == alphaCnt[str.charAt(i) - 65] ) {
                result = '?';
            }
        }
        
        System.out.println(result);
        // String removeRepeatStr = "";
        
        // HashMap hm = new HashMap<Character, Integer>();

        // for( int i = 0; i < str.length(); i++ ) {
        //     if( !removeRepeatStr.contains(String.valueOf(str.charAt(i))) ) {
        //         removeRepeatStr += str.charAt(i);
        //     }
        // }

        // int maxCnt = 0;
        // for( int i = 0; i < removeRepeatStr.length(); i++ ) {
        //     int charCnt = 0;
        //     int fromIdx = -1;
            
        //     while( (fromIdx = str.indexOf(String.valueOf(removeRepeatStr.charAt(i)), fromIdx + 1)) >= 0) {
        //         charCnt ++;
        //     }

        //     hm.put(removeRepeatStr.charAt(i), charCnt);

        //     if( maxCnt < charCnt ) 
        //         maxCnt = charCnt;
        //     else if( maxCnt == charCnt ) {
        //         System.out.println("?");
        //         break;
        //     }
            
        //     if( i == removeRepeatStr.length() - 1 ) {
        //         for( Object o : hm.keySet() ) {
        //             if( hm.get(o).equals(maxCnt) ){
        //                 System.out.println(o);
        //             }
        //         }
        //     }
        // }        

        sc.close();
    }
}