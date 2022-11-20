package BackJoon;

import java.util.Scanner;

public class P2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hh = sc.nextInt();
        int mm = sc.nextInt();
        int cook = sc.nextInt();

        mm+=cook;

        if(mm>=60){
            hh+=mm/60;
            mm=mm%60;
        }
        if(hh>=24){
            hh%=24;
        }
        System.out.print(hh+" "+mm);
    }
}
