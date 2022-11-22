package BackJoon;

import java.util.Scanner;

public class P2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int room = sc.nextInt();
        int count = 0;

        while(room>1){
            count++;
            room -= 6*count;
        }
        System.out.print(count+1);
    }
}
