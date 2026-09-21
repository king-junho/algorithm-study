import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int index=-1;

        for(int i=0; i<query.length; i++){
            if(i%2==0){
                index=list.indexOf(query[i]);
                list = Arrays.stream(list.stream().mapToInt(Integer::intValue).toArray(),0,query[i]+1).boxed().collect(Collectors.toList());
            }else{
                index=list.indexOf(query[i]);
                list = Arrays.stream(list.stream().mapToInt(Integer::intValue).toArray(),query[i],list.size()).boxed().collect(Collectors.toList());
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}