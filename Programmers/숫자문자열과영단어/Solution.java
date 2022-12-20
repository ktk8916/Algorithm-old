package Programmers.숫자문자열과영단어;

import java.util.*;

public class Solution {
    public int solution(String s) {
        HashMap<String, String> number = new HashMap<>();
        StringBuffer answer = new StringBuffer();

        number.put("zero", "0");
        number.put("one", "1");
        number.put("two", "2");
        number.put("three", "3");
        number.put("four", "4");
        number.put("five", "5");
        number.put("six", "6");
        number.put("seven", "7");
        number.put("eight", "8");
        number.put("nine", "9");
        StringBuffer sb = new StringBuffer();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                answer.append(c);
            }
            else{
                sb.append(c);
                String word = number.get(sb.toString());
                if(word!=null){
                    answer.append(word);
                    sb.setLength(0);
                }
            }
        }

        return Integer.parseInt(answer.toString());
    }
}
