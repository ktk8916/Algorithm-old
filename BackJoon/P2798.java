package BackJoon;

import java.util.Scanner;

public class P2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        final int goal = sc.nextInt();

        int[] cards = new int[size];

        for(int i=0;i<size;i++){
            cards[i] = sc.nextInt();
        }

        int answer = 0;

        for(int i=0;i<size-2;i++){
            for(int j=i+1;j<size-1;j++){
                for(int k=j+1;k<size;k++){
                    int sum = cards[i]+cards[j]+cards[k];
                    if(answer < sum && sum <= goal){
                        answer = sum;
                    }
                }
            }
        }
        System.out.println(answer);

    }
}
