package BackJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P15828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int buffer = sc.nextInt();
        while(true){
            int input = sc.nextInt();
            if(input==-1){
                break;
            }
            if(input==0){
                q.poll();
            }
            else if(q.size()<buffer){
                q.add(input);
            }
        }
        if(q.isEmpty()){
            System.out.println("empty");
        }
        else{
            for(int i:q) {
                System.out.println(i);
            }
        }
    }
}
