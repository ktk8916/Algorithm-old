package Programmers.폰켓몬;

import java.util.*;

public class Solution {
    public int solution(int[] nums) {
        int choice = nums.length / 2;
        HashSet<Integer> mon = new HashSet<>();
        for(int num:nums){
            mon.add(num);
        }
        if(mon.size()>=choice){
            return choice;
        }
        else{
            return mon.size();
        }
    }
}
