package BackJoon;

import java.util.*;

public class P1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int input = sc.nextInt();
        int[] sticks = {64, 32, 16, 8, 4, 2, 1};
        for(int stick:sticks){
            if(input>=stick){
                input-=stick;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
