import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(String s: strArr){
            map.put(s.length(), map.getOrDefault(s.length(),0)+1);
        }

        return map.values().stream().max(Comparator.comparingInt(Integer::intValue)).get();
    }
}