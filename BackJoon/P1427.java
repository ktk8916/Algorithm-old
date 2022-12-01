package BackJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1427 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = Integer.toString(num).split("");
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
