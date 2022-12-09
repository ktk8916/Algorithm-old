package Programmers.로또의최고순위와최저순위;

import java.util.*;

public class Solution {
    public int getRank(int n) {
        int rank = 0;
        switch (n) {
            case 0:
            case 1:
                rank = 6;
                break;
            case 2:
                rank = 5;
                break;
            case 3:
                rank = 4;
                break;
            case 4:
                rank = 3;
                break;
            case 5:
                rank = 2;
                break;
            case 6:
                rank = 1;
                break;
        }
        return rank;
    }

    public int[] solution(int[] lottos, int[] winNums) {
            int zero = 0;
            int winCount = 0;
            int[] answer = new int[2];
            for(int num:lottos){
                if(num==0){
                    zero++;
                }

                for(int win:winNums){
                    if(num==win){
                        winCount++;
                    }
                }
            }
            answer[0] = getRank(winCount + zero);
            answer[1] = getRank(winCount);

            return answer;
        }
}
