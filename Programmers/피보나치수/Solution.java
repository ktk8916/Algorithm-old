package Programmers.피보나치수;

public class Solution {

//     public int plus(int n){
//         if(n==1){
//             return 1;
//         }

//         if(n==0){
//             return 0;
//         }
//         return (plus(n-1)%1234567 + plus(n-2)%1234567)%1234567; 
//     }

    public int solution(int n) {
        int[] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i=2;i<=n;i++){
            fibonacci[i] = fibonacci[i-2]%1234567 + fibonacci[i-1]%1234567;
        }
        return fibonacci[n]%1234567;
    }
}
