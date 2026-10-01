import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        int toIndex=0;
        
        for(int i = 0; i<arr.length; i++){
            if(flag[i]){
                list.addAll(Collections.nCopies(arr[i]*2,arr[i]));
            }else{
                toIndex = Math.max(0,list.size()-arr[i]);
                list=list.subList(0,toIndex);
            }
        }
    
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}