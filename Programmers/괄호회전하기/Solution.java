package Programmers.괄호회전하기;

import java.util.*;

public class Solution {
    public char pair(char s){
        if(s==']'){
            return '[';
        }
        else if(s=='}'){
            return '{';
        }
        else{
            return '(';
        }
    }

    public boolean isValidPs(String s){

        Stack<Character> stack = new Stack<>();

        for(char p:s.toCharArray()){
            if(p=='['||p=='{'||p=='('){
                stack.push(p);
            }
            else if(stack.isEmpty()||stack.peek()!=pair(p)){
                return false;
            }
            else{
                stack.pop();
            }
        }
        return true;
    }

    public String moveLeft(String s){
        int size = s.length();
        return s.substring(1, size) + s.charAt(0);
    }

    public int solution(String s) {

        int answer = 0;
        int size = s.length();

        if(size%2==1){
            return answer;
        }

        String ps = s;

        for(int i=0;i<size;i++){
            if(isValidPs(ps)){
                answer++;
            }
            ps = moveLeft(ps);
        }
        return answer;
    }
}
