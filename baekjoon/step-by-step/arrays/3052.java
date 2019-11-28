import java.util.*;

public class Solution {
    public final static int DIVNUM = 42;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet hs = new HashSet<Integer>();

        int numArr[] = new int[10];

        for (int i = 0; i < numArr.length; i++) 
            numArr[i] = sc.nextInt();

        sc.close();

        for(int i=0; i<numArr.length; i++) {
            int tempRemainder = numArr[i] % DIVNUM;
            hs.add(tempRemainder);
        }

        System.out.println(hs.size());
    }
}