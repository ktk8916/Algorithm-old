package Programmers.멀리뛰기;

public class Solution {
    long answer = 0;
//     DFS 시간초과
//     public void dfs(int n, int index){
//         if(n==index){
//             answer++;
//             return;
//         }

//         if(index+1 <= n){
//             dfs(n, index+1);
//         }
//         if(index+2<=n){
//             dfs(n, index+2);
//         }
//     }

    public long solution(int n) {

        long[] dp = new long[n+1];

        dp[0] = 1;
        dp[1] = 2;
        for(int i=2;i<n;i++){
            dp[i] = (dp[i-1] + dp[i-2])%1234567;
        }
        return dp[n-1];
    }
}
