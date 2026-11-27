import java.util.*;
class Queue{
    int idx;
    int priority;

    public Queue(int idx, int priority){
        this.idx = idx;
        this.priority = priority;
    }
}
class Solution {
    public int solution(int[] priorities, int location) {
        Deque<Queue> queue = new ArrayDeque<>();

        for(int i=0; i<priorities.length; i++){
            queue.offer(new Queue(i,priorities[i]));
        }
        int order=0;

        while(!queue.isEmpty()){
            Queue current = queue.poll();

            boolean hasHigher = false;

            for(Queue waiting: queue){
                if(waiting.priority>current.priority){
                    hasHigher = true;
                    break;
                }
            }
            if(hasHigher){
                queue.offer(current);
            }else{
                order++;
                if(current.idx==location){
                    break;
                }
            }
        }
        return order;
    }
}