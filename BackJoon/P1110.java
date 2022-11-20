package BackJoon;

import java.util.Scanner;

public class P1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int newNum = num;
        int count = 0;


        while(true) {
            count++;

            int oneDigit = newNum % 10;
            int tenDigit = newNum / 10;


            newNum = oneDigit * 10 + (oneDigit + tenDigit) % 10;
            if(num==newNum) break;
        }
        System.out.print(count);
    }
}
