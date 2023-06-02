import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for(String s : keymap){
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(map.containsKey(c)){
                    if(map.get(c)>i){
                        map.put(c, i+1);
                    }
                } else {
                    map.put(c, i+1);
                }
            }
        }
        
        
        for(int i=0;i<targets.length;i++){
            int point = 0;
            for(char c : targets[i].toCharArray()){
                if(map.containsKey(c)){
                    point += map.get(c);
                } else {
                    point = -1;
                    break;
                }
            }
            answer[i] = point;
        }
        return answer;
    }
}
