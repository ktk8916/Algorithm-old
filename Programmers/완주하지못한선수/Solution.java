package Programmers.완주하지못한선수;

import java.util.*;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> list = new HashMap<>();
        String answer = "";
        for(String name:participant){
            list.put(name, list.getOrDefault(name, 0)+1);
        }
        for(String name:completion){
            list.put(name, list.get(name)-1);
        }

        Set<String> names = list.keySet();

        for(String name:names){
            if(list.get(name)!=0){
                answer=name;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
