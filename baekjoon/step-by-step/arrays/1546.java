import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numberOfSubjects = sc.nextInt();
        float scoreOfSubject[] = new float[numberOfSubjects];

        for(int i = 0; i<scoreOfSubject.length; i++) {
            scoreOfSubject[i] = sc.nextInt();
        }

        sc.close();;

        float maxScore = scoreOfSubject[0];
        float totalScore = 0;
        
        for(int i = 0; i<scoreOfSubject.length; i++) {
            if( maxScore < scoreOfSubject[i] ) maxScore = scoreOfSubject[i];
        }

        for(int i = 0; i<scoreOfSubject.length; i++) {
            scoreOfSubject[i] = (scoreOfSubject[i] / maxScore) * 100;
            totalScore += scoreOfSubject[i];
        }

        System.out.println(totalScore / (float)numberOfSubjects);

    }
}