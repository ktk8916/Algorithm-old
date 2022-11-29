package Programmers.문자열내p와y의개수;

class solution {
    boolean solution(String s) {
        String input = s.toUpperCase();
        int count = 0;

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='P'){
                count++;
            }
            if(input.charAt(i)=='Y'){
                count--;
            }
        }
        boolean answer = true;

        if(count!=0){
            answer=false;
        }

        return answer;
    }
}
