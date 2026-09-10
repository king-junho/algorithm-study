import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for(String intStr : intStrs){
            int value = Integer.valueOf(intStr.substring(s,s+l));
            if(value>k){
                list.add(value);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}