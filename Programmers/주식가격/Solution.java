package Programmers.주식가격;

import java.util.*;

public class Solution {
    public int[] solution(int[] prices) {
        int length = prices.length;
        int[] answer = new int[length];
        for(int i=0;i<length;i++){
            int count = 0;
            for(int j=i+1;j<length;j++){
                count++;
                if(prices[i]>prices[j]){
                    answer[i] = count;
                    break;
                }
                answer[i] = count;
            }
        }
        return answer;
    }
}
