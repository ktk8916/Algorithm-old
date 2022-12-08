package BackJoon;

import java.util.Scanner;

public class P2231 {

    static int sumDigit(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int goal = sc.nextInt();
        int answer = 0;

        for(int i=0;i<=goal;i++){
            if(i+sumDigit(i)==goal){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
