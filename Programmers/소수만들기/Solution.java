package Programmers.소수만들기;

public class Solution {
    public int isPrime(int n){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }

    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length;

        for(int i=0;i<size-2;i++){
            for(int j=i+1;j<size-1;j++){
                for(int k=j+1;k<size;k++){
                    answer += isPrime(nums[i]+nums[j]+nums[k]);
                }
            }
        }

        return answer;
    }

}
