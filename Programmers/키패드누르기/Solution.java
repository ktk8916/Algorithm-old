package Programmers.키패드누르기;

public class Solution {
    public char getThumb(int leftPos, int rightPos, int number, String hand){
        char thumb = hand.equals("right") ? 'R': 'L';
        int left = Math.abs((number-1)/3-(leftPos-1)/3)+Math.abs((number-1)%3-(leftPos-1)%3);
        int right = Math.abs((number-1)/3-(rightPos-1)/3)+Math.abs((number-1)%3-(rightPos-1)%3);
        if(left>right){
            thumb = 'R';
        }
        if(right>left){
            thumb = 'L';
        }
        return thumb;
    }

    public String solution(int[] numbers, String hand) {
        StringBuffer sb = new StringBuffer();
        int leftPos = 10;
        int rightPos = 12;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == 0){
                numbers[i]=11;
            }
        }

        for(int number:numbers){
            if(number==1 || number==4||number==7){
                sb.append("L");
                leftPos = number;
            }
            else if(number==3 || number==6||number==9){
                sb.append("R");
                rightPos = number;
            }
            else if(getThumb(leftPos, rightPos, number, hand)=='L'){
                sb.append("L");
                leftPos = number;
            }
            else{
                sb.append("R");
                rightPos = number;
            }
        }
        return sb.toString();
    }
}
