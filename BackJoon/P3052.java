package BackJoon;

import java.util.HashSet;
import java.util.Scanner;

public class P3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> diff = new HashSet<>();

        for(int i=0;i<10;i++){
            diff.add( sc.nextInt()%42 );
        }

        System.out.print(diff.size());
    }
}
