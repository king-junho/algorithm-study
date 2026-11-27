import java.awt.*;
import java.util.ArrayDeque;
import java.util.Deque;

class Truck{
    int weight;
    int departTime;

    Truck(int weight, int departTime){
        this.weight = weight;
        this.departTime = departTime;
    }
}
public class P171 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time=1;
        int sum=0;
        int truckIdx=0;

        Deque<Truck> queue = new ArrayDeque<>();
        queue.offer(new Truck(truck_weights[truckIdx],time+bridge_length));
        sum+=truck_weights[truckIdx];
        truckIdx++;

        while(!queue.isEmpty()){
            time++;

            if(queue.peek().departTime==time){
                Truck removedTruck = queue.remove();
                sum-=removedTruck.weight;
            }

            if(truckIdx<truck_weights.length && queue.size()<bridge_length&&sum+truck_weights[truckIdx]<=weight){
                queue.offer(new Truck(truck_weights[truckIdx],time+bridge_length));
                sum+=truck_weights[truckIdx];
                truckIdx++;
            }

        }
        return time;
    }
    public static void main(String[] args) throws Exception {
    /*
    1.13:50 시작 ~ 14:20분 종료
    queue 빌때까지 시간 증가시키면서
    queue에 뺄거 뺴고
    (1)queue에 크기 (2)총무게 (3)truckIdx 조건 만족하면 queuedp 에 넣기
    마지막 종료할 될 때 시간 반환

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(L*N) : L은 다리 길이 N은 트럭 개수
    공간 복잡도 : O(N) :

    3. 자료구조

    */


        Solution s = new Solution();
        int bridge_length=2;
        int weight=10;
        int[] truck_weights = {7,4,5,6};
        System.out.println(s.solution(bridge_length,weight,truck_weights));
  }
}
