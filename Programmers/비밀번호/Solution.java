package Programmers.비밀번호;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i=0;i<n;i++){
            String binary1 = Long.toBinaryString(arr1[i]);
            String binary2 = Long.toBinaryString(arr2[i]);
            binary1 = "0".repeat(n-binary1.length()) + binary1;
            binary2 = "0".repeat(n-binary2.length()) + binary2;
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<n;j++){
                if(binary1.charAt(j)=='1' || binary2.charAt(j)=='1'){
                    sb.append("#");
                }
                else{
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }

        return answer;
    }
}
