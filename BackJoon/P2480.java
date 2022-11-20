package BackJoon;

import java.util.Scanner;

public class P2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.print(10000+1000*num1);
        }
        else if(num1==num2){
            System.out.print(1000+100*num1);
        }
        else if(num1==num3){
            System.out.print(1000+100*num1);
        }
        else if(num2==num3){
            System.out.print(1000+100*num2);
        }
        else{
            System.out.print( Math.max( Math.max(num1, num2), num3)*100);
        }
    }
}
