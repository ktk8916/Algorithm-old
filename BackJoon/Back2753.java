package BackJoon;

import java.util.Scanner;

public class Back2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%400==0 || (year%4==0 && year%100 !=0)) System.out.print(1);
        else System.out.print(0);

    }
}
