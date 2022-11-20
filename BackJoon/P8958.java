package BackJoon;

import java.util.Scanner;

public class P8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        for(int i=0;i<size;i++){
            int count = 0;
            int point = 0;
            String quiz = sc.next();
            for(int j=0;j<quiz.length();j++){
                if(quiz.charAt(j)=='O'){
                    count+=1;
                    point+=count;
                }
                else{
                    count=0;
                }
            }
            System.out.println(point);
        }
    }
}
