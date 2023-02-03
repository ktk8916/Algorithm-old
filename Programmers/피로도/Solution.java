package Programmers.피로도;

public class Solution {

    int answer = 0;
    boolean[] isVisited;

    public void dfs(int k, int[][] dungeons, int clear, boolean[] isVisited){
        answer = Math.max(answer, clear);


        for(int i=0;i<dungeons.length;i++){
            if(dungeons[i][0]<=k && !isVisited[i]){
                isVisited[i] = true;
                dfs(k-dungeons[i][1], dungeons, clear+1, isVisited);
                isVisited[i] = false;
            }
        }

    }
    public int solution(int k, int[][] dungeons) {

        isVisited = new boolean[dungeons.length];
        dfs(k, dungeons, 0, isVisited);
        return answer;
    }
}
