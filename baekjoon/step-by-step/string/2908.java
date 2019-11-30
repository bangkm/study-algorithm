import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );

        String str = sc.nextLine();
        String[] splitStr = str.split(" ");
        String resultA = "";
        String resultB = "";

        for( int i = splitStr[0].length()-1; i >= 0; i-- ) 
            resultA += splitStr[0].charAt(i);
        

        for( int i = splitStr[1].length()-1; i >= 0; i-- ) 
            resultB += splitStr[1].charAt(i);
        
        if( Integer.parseInt(resultA) > Integer.parseInt(resultB) ) System.out.println(resultA);
        else System.out.println(resultB);
        
        sc.close();
    }
}