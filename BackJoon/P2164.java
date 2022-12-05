package BackJoon;

import java.util.LinkedList;
import java.util.Scanner;

public class P2164 {

    static int solution(int size){

        LinkedList<Integer> list = new LinkedList<>();

        for(int i=1;i<=size;i++){
            list.add(i);
        }

        while(true){
            list.removeFirst();
            if(list.size()==1){
                break;
            }
            list.addLast(list.getFirst());
            list.removeFirst();
        }
        return list.get(0);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        if(size==1){
            System.out.println(1);
        }
        else{
            System.out.println(solution(size));
        }
    }
}