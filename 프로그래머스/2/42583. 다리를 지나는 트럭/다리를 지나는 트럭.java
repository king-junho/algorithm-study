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
class Solution {
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
}