import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(list.size()==0){
                list.add(arr[i]);
            }else{
                if(list.getLast()==arr[i]){
                    list.removeLast();
                }else{
                    list.add(arr[i]);
                }
            }
        }
        return list.size()!=0 ? list.stream().mapToInt(Integer::intValue).toArray() : new int[]{-1};
    }
}