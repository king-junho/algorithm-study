import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer>list = new ArrayList<>();
        List<Integer> deleteList = IntStream.of(delete_list).boxed().toList();

        for(int n :arr){
            if (!deleteList.contains(n)) {
                list.add(n);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}