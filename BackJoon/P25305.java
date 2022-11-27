package BackJoon;

import java.util.Scanner;

public class P25305 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int size = sc.nextInt();
        int cutLine = sc.nextInt();
        int[] num = new int[size];

        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(num[i]<num[j]){
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
        System.out.println(num[cutLine-1]);
    }
}
