import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int[] days = new int[progresses.length];

        for(int i=0; i<progresses.length; i++){
            int day = (100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i]!=0){
                day++;
            }
            days[i]=day;
        }

        int left=0;

        for(int right=0; right<progresses.length; right++){
            if(days[left]<days[right]){
                answer.add(right-left);
                left=right;
            }


            if(right==progresses.length-1){
                answer.add(right-left+1);
            }
        }


        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}