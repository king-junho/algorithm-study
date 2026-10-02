import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public boolean isPowerofTwo(int n){
        return n>0 && (n&(n-1))==0;
    }
    
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        while(!isPowerofTwo(list.size())){
            list.add(0);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}