import java.util.PriorityQueue;

class Solution {

    public int solution(int[] scoville, int K) {
        int count=0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            pq.offer((long)scoville[i]);
        }

        while(pq.size()>1){
            long first = pq.poll();
            long second = pq.poll();

            if(first>=K){
                return count;
            }

            long value = first+(second*2);
            pq.offer(value);

            count++;
        }

        return pq.peek()>K ? count : -1;
    }
}