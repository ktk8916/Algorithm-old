package Programmers.게임맵최단거리;

import java.util.*;

public class Solution {
    public static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }

    }
    public int solution(int[][] maps) {
        int answer = 0;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int maxX = maps.length;
        int maxY = maps[0].length;

        Queue<Node> q = new LinkedList<>();

        maps[0][0] = 0;
        q.offer(new Node(0, 0));

        while(!q.isEmpty()){
            answer++;
            int size = q.size();
            for(int i=0;i<size;i++){
                Node node = q.poll();
                if(node.x==maxX-1 && node.y==maxY-1){
                    return answer;
                }
                for(int j=0;j<4;j++){

                    int nx = node.x + dx[j];
                    int ny = node.y + dy[j];

                    if(nx>=0 && ny>=0 && nx<maxX && ny<maxY && maps[nx][ny]==1){
                        maps[nx][ny] = 0;
                        q.offer(new Node(nx, ny));
                    }
                }
            }
        }
        return -1;
    }
}