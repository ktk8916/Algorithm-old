package Programmers.짝수와홀수;

public class Solution {
    public String solution(int num) {
        int input = Math.abs(num);
        return (input % 2 == 1) ? "Odd" : "Even";
    }
}
