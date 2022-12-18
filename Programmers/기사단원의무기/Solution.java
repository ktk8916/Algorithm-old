package Programmers.기사단원의무기;

public class Solution {
    public int getDivCount(int num){
        int count = 0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                count++;
                if(i*i<num){
                    count++;
                }
            }
        }
        return count;
    }

    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1;i<=number;i++){
            int ad = getDivCount(i);
            System.out.println(ad);
            if(ad > limit){
                answer += power;
            }
            else{
                answer += ad;
            }
        }
        return answer;
    }
}
