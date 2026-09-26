import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length;

        if(length>=11){
            return Arrays.stream(num_list).sum();
        }else{
            int answer = 1;
            for(int i=0; i<length; i++){
                answer*=num_list[i];
            }
            return answer;
        }
    }
}