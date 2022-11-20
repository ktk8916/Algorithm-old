package BackJoon;

import java.util.Scanner;

public class P10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputCase = sc.nextInt();
        int findNum = sc.nextInt();
        int[] numbers = new int[inputCase];

        for(int i=0;i<inputCase;i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<findNum){
                System.out.print(numbers[i]+" ");
            }
        }
    }
}
