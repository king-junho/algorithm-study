import java.util.ArrayList;
import java.util.List;

public class P172 {
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

    public static void main(String[] args) throws Exception {
    /*
    1.14:45 시작 ~ 15:00분 종료
    각각의 작업 완료일 계산 (100-progresses)/speeds 이때 둘의 나머지가 0이 아니면 +1해주기
    작업 완료일 left=0 right=0으로 놓고 right값이 left값보다 커질 때 멈추고

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(L*N) : L은 다리 길이 N은 트럭 개수
    공간 복잡도 : O(N) :

    3. 자료구조

    */


        Solution s = new Solution();
        int[] progress = {93,30,55};
        int[] speeds = {1,30,5};
        System.out.println(s.solution(progress,speeds));
  }
}
