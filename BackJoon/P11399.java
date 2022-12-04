package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] times = new int[size];
        int sum=0;
        int answer = 0;
        for(int i=0;i<size;i++){
            times[i] = sc.nextInt();
        }

        Arrays.sort(times);
        for(int time:times){
            sum += time;
            answer +=sum;
        }
        System.out.println(answer);
    }
}
