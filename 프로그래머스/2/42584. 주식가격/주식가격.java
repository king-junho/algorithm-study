import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Price{
    int idx;
    int price;

    public Price(int idx, int price){
        this.idx = idx;
        this.price = price;
    }
}

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Price> stack = new ArrayDeque<>();
        for(int i=0; i<prices.length; i++){
            if(!stack.isEmpty()){
                while(!stack.isEmpty()&&stack.peek().price>prices[i]){
                    Price removed = stack.pop();
                    answer[removed.idx] = i-removed.idx;

                }
            }
            stack.push(new Price(i, prices[i]));
        }

        while(!stack.isEmpty()){
            Price removed = stack.pop();
            answer[removed.idx] = prices.length-(removed.idx+1);
        }
        return answer;
    }
}