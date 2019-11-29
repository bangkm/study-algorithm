import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        float result[] = new float[testCase];

        for(int i=0; i<testCase; i++) {
            int count = 0;
            int total = 0;
            int n = sc.nextInt();
            int score[] = new int[n];

            for(int j=0; j<n; j++) {
                score[j] = sc.nextInt();
                total += score[j];
            }

            float avg = (float)total / n;

            for(int j=0; j<n; j++) {
                if(score[j] > avg) {
                    count++;
                }
            }
            result[i] = (float)100*count/n;
        }

        sc.close();

        for(int i=0; i<testCase; i++) {
            System.out.printf("%.3f", result[i]);
            System.out.println("%");
        }
    }
}