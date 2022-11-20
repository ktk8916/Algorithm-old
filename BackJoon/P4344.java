package BackJoon;

import java.util.Scanner;

public class P4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        for(int i=0;i<size;i++){
            int student = sc.nextInt();
            int[] scores = new int[student];
            int sum = 0;
            int avg = 0;
            int count = 0;
            for(int j=0;j<student;j++){
                int score = sc.nextInt();
                scores[j] = score;
                sum+= score;
            }
            avg = sum/student;
            for(int j=0;j<student;j++){
                if(scores[j]>avg){
                    count++;
                }
            }
            double overRate = (double)count/student*100;
            System.out.println( String.format("%.3f", overRate)+"%" );

        }
    }
}
