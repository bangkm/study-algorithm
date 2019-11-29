import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList arrList = new ArrayList<String>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int r = sc.nextInt();
            String str = sc.next();

            arrList.add(repeatString(r, str));
        }

        for(int i=0; i<arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        sc.close();
    }

    public static String repeatString(int r, String str) {
        String resultString = "";

        for(int i=0; i<str.length(); i++) {
            char currentChar = str.charAt(i);
            for( int j=0; j<r; j++) {
                resultString += currentChar;
            }
        }

        return resultString;
    }
}