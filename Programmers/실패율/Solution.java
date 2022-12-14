package Programmers.실패율;

import java.util.*;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Integer> arrive = new HashMap<>();
        HashMap<Integer, Double> failureRate = new HashMap<>();
        int count = stages.length;

        for(int user:stages){
            arrive.put(user, arrive.getOrDefault(user, 0)+1);
        }

        for(int i=1;i<=N;i++){
            if(count!=0){
                failureRate.put(i, arrive.getOrDefault(i, 0)  / (double)count);
            }
            else{
                failureRate.put(i, 0d);
            }
            count -= arrive.getOrDefault(i, 0);
        }

        List<Integer> list = new ArrayList<>(failureRate.keySet());
        Collections.sort(list, (o1, o2) ->
            Double.compare(failureRate.get(o2), failureRate.get(o1)));

        for(int i=0;i<N;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
