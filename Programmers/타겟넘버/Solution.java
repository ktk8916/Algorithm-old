package Programmers.타겟넘버;

public class Solution {
    int answer = 0;
    public void bfs(int[] numbers, int target, int depth, int sum){
        if(numbers.length == depth){
            if(target==sum){
                this.answer++;
            }
            return;
        }
        bfs(numbers, target, depth+1, sum+numbers[depth]);
        bfs(numbers, target, depth+1, sum-numbers[depth]);
    }

    public int solution(int[] numbers, int target) {
        bfs(numbers, target, 0, 0);
        return this.answer;
    }
}
