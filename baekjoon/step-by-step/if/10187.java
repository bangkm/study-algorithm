import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int[] num = new int[3];

        for(int i = 0; i<3; i++) {
            num[i] = sc.nextInt();
        }

        sc.close();

        // Selecetion Sort
        for( int i = 0; i < num.length - 1; i++ ) {
            int minIndex = i;

            for( int j = i+1; j<num.length; j++ ) {
                if( num[minIndex] > num[j] ) {
                    minIndex = j;
                }
            }

            int temp = num[i];
            num[i] = num[minIndex];
            num[minIndex] = temp;
        }

        System.out.println(num[1]);
    }
}