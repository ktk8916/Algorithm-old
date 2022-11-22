package BackJoon;

import java.util.Scanner;

public class P2908 {

    public static int flipNumber(int num){
        int digitOne = num%10;
        int digitTen = (num/10)%10;
        int digitHun = num/100;
        return digitOne*100 + digitTen*10 + digitHun;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int flipNum1 = flipNumber(num1);
        int flipNum2 = flipNumber(num2);

        System.out.println(Math.max(flipNum1, flipNum2));
    }
}
