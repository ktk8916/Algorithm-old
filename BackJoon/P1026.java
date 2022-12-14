package BackJoon;

import java.util.*;

public class P1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int size = sc.nextInt();

        int[] num1 = new int[size];
        for(int i=0;i<size;i++){
            num1[i] = sc.nextInt();
        }
        int[] num2 = new int[size];
        for(int i=0;i<size;i++){
            num2[i] = sc.nextInt();
        }

        Arrays.sort(num1);
        Arrays.sort(num2);

        for(int i=0;i<size;i++){
            answer += num1[i] * num2[size-1-i];
        }
        System.out.println(answer);
    }
}
