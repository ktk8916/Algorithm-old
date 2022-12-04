package BackJoon;

import java.util.*;

public class P1764 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noneListenNum = sc.nextInt();
        int noneSeaNum = sc.nextInt();


        HashSet<String> noneListenName = new HashSet<>();

        for(int i=0;i<noneListenNum;i++){
            noneListenName.add(sc.next());
        }

        ArrayList<String> noneListenSeaName = new ArrayList<>();
        for(int i=0;i<noneSeaNum;i++){
            String noneSeaName = sc.next();
            if(noneListenName.contains(noneSeaName)){
                noneListenSeaName.add(noneSeaName);
            }
        }

        Collections.sort(noneListenSeaName);
        System.out.println(noneListenSeaName.size());
        for(String name:noneListenSeaName){
            System.out.println(name);
        }

    }
}
