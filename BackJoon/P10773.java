package BackJoon;

import java.util.Scanner;
import java.util.Stack;

public class P10773 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<size;i++){
            int num = sc.nextInt();
            if(num!=0){
                stack.push(num);
            }
            else{
                stack.pop();
            }
        }

        for(int i=0;i<stack.size();i++){
            answer+=stack.get(i);
        }
        System.out.print(answer);
    }
}
