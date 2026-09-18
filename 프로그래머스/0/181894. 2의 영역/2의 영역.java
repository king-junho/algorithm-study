import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int [] result;
        int firstIdx = IntStream.range(0,arr.length).filter(i->arr[i]==2).findFirst().orElse(-1);
        int lastIdx = arr.length-1-IntStream.range(0,arr.length).filter(i->arr[arr.length-i-1]==2).findFirst().orElse(-1);

        if(firstIdx!=-1)
            result = Arrays.stream(arr,firstIdx,lastIdx+1).boxed().collect(Collectors.toList()).stream().mapToInt(Integer::intValue).toArray();
        else
            result = new int[]{-1};

        return result;

    }
}