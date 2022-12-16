package Programmers.푸드파이트대회;

import java.util.*;

public class Solution {
    public String solution(int[] food) {
        int size = food.length;
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<size;i++){
            for(int j=0;j<food[i]/2;j++){
                sb.append(Integer.toString(i));
            }
        }
        StringBuffer answer = new StringBuffer();
        answer.append(sb.toString());
        answer.append("0");
        answer.append(sb.reverse().toString());
        return answer.toString();
    }
}
