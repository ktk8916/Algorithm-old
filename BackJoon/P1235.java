package BackJoon;

import java.util.*;

public class P1235 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.next();
        }


        for(int i=1;i<=arr[0].length();i++){
            HashSet<String> set = new HashSet<>();
            for(int j=0;j<size;j++){
                set.add(arr[j].substring(arr[0].length()-i));
            }
            if(set.size()==size){
                System.out.println(i);
                break;
            }
        }
    }
}
