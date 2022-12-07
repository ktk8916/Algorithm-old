package Programmers.기능개발;

import java.util.*;

public class Solution {
    int[] solution(int[] progresses, int[] speeds) {
        int size = speeds.length;
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            int day = (int)Math.ceil((100-progresses[i]) / (double)speeds[i]);

            if(q.isEmpty() || day<=q.peek()){
                q.add(day);
            }
            else{
                list.add(q.size());
                q.clear();
                q.add(day);
            }
        }
        list.add(q.size());


        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
