import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> keyLists;

        for(int i=0; i<rank.length; i++){
            if(attendance[i]){
                map.put(rank[i],i);
            }
        }

        keyLists = map.keySet().stream().sorted().toList();

        return map.get(keyLists.get(0))*10000 + 100*map.get(keyLists.get(1)) + map.get(keyLists.get(2));
    }
}