import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = Arrays.stream(arr).distinct().limit(k).boxed().collect(Collectors.toList());

        while(list.size()<k){
            list.add(-1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}