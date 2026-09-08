import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();
        int i=0;

        while(i<arr.length){
            if(stkList.isEmpty()){
                stkList.add(arr[i]);
                i++;
            }

            if(stkList.getLast()<arr[i]){
                stkList.add(arr[i]);
                i++;
            }else{
                stkList.removeLast();
            }
        }
        return stkList.stream().mapToInt(Integer::intValue).toArray();
    }
}