package Programmers.같은숫자는싫어;
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int size = arr.length;
        List<Integer> list = new ArrayList<Integer>();
        int checkNum = -1;

        for(int num:arr){
            if(checkNum != num){
                checkNum = num;
                list.add(checkNum);
            }

        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
