package BackJoon;

import java.util.Scanner;

public class P1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int size = sc.nextInt();
        int[] inputNum = new int[size];
        for(int i=0;i<size;i++){
            inputNum[i] = sc.nextInt();
        }
        for(int num : inputNum){
            int count = 0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                answer++;
            }
        }
        System.out.println(answer);


    }
}
