import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        int[] num = new int[3];
        int temp;

        for(int i = 0; i<3; i++) {
            num[i] = sc.nextInt();
        }

        for(int i = 0; i < num.length - 1; i++) {
            for(int j = i+1; j < num.length; j++) {
                if( num[i] > num[j] ) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        for(int i = 0; i<3; i++) {
            System.out.println(num[i]);
        }

    }
}