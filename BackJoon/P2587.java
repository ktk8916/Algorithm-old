package BackJoon;

import java.util.Scanner;

public class P2587 {

    public static int getAvg(int[] arr){

        int size = arr.length;

        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int[] num = new int[5];
        for(int i=0;i<5;i++){
            num[i] = sc.nextInt();
            sum+=num[i];
        }
        System.out.println(sum/5);
        System.out.println(getAvg(num));


    }
}
