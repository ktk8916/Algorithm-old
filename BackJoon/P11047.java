package BackJoon;

import java.util.Scanner;

public class P11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int goal = sc.nextInt();
        int [] coin = new int[size];
        int answer = 0;

        for(int i=0;i<size;i++){
            coin[i] = sc.nextInt();
        }

        for(int i=size-1;i>=0;i--){
            if(coin[i]<=goal){
                int count=goal/coin[i];
                goal-=count*coin[i];
                answer += count;
            }
        }
        System.out.println(answer);
    }
}
