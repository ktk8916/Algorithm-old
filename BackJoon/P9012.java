package BackJoon;

import java.util.Scanner;
import java.util.Stack;

public class P9012 {

    static String vps(String ps){

        Stack<Character> stack = new Stack<>();
        for (int j = 0; j < ps.length(); j++) {
            if(ps.charAt(j) == '(') {
                stack.push(ps.charAt(j));
            }
            else{
                if(stack.isEmpty()){
                    return "NO";
                }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }
        else{
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        for(int i=0;i<size;i++) {

            String ps = sc.next();
            System.out.println(vps(ps));
        }
    }
}
