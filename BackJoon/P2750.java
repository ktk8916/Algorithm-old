package BackJoon;

import java.util.Scanner;

public class P2750 {

    public static void selectionSort(int[] arr){

        int size = arr.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr){
        int size = arr.length;

        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        //selectionSort(arr);
        bubbleSort(arr);


    }
}
