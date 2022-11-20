package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputCase = sc.nextInt();
//        int[] numbers = new int[inputCase];
//
//        for(int i=0; i<inputCase; i++){
//            numbers[i] = sc.nextInt();
//        }
//        Arrays.sort(numbers);
//        System.out.print(numbers[0]+" "+numbers[numbers.length-1]);
        int max = sc.nextInt();
        int min = max;

        for(int i=0;i<inputCase-1;i++){
            int inputNum = sc.nextInt();
            if(max<inputNum) max = inputNum;
            if(min>inputNum) min = inputNum;
        }

        System.out.print(min+" "+max);
    }
}
