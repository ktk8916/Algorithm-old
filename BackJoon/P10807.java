package BackJoon;

import java.util.Scanner;

public class P10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputCase = sc.nextInt();
        int[] numbers = new int[inputCase];
        int count = 0;

        for(int i=0;i<inputCase;i++){
            numbers[i] = sc.nextInt();
        }

        int findNum = sc.nextInt();

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==findNum){
                count++;
            }
        }
        System.out.print(count);
    }
}
