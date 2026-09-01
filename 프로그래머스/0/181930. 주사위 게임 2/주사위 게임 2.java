import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Solution {
    public int solution(int a, int b, int c) {
        int answer =0;
        
        Set<Integer> set = new HashSet<>();
        set.addAll(List.of(a, b, c));

        if(set.size() ==1){
            answer = (int)((a+b+c)*(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2))*(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)));
        }else if(set.size()==2){
            answer = (int)((a+b+c)*(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)));
        }else{
            answer = a+b+c;
        }
        return answer;
    }
}