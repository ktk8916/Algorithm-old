package BackJoon;

import java.util.Scanner;

public class P2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hh = sc.nextInt();
        int mm = sc.nextInt();

        mm = mm-45;
        if(mm<0){
            mm+=60;
            hh-=1;
        }
        if(hh<0){
            hh+=24;
        }
        System.out.print(hh+" "+mm);
    }
}
