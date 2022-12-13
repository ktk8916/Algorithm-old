package Programmers.완주하지못한선수;

import java.util.HashMap;

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

        for(String name:list){

        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] a = {"mislav", "stanko", "mislav", "ana"};
        String[] b = {"stanko", "ana", "mislav"};
        s.solution(a, b);
    }
}
