import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        int[] arr;
        List<Integer> answer = new ArrayList<>();
        String value="";
        for(int i=l; i<=r; i++){
            value = String.valueOf(i);
            value=value.replace("5","");
            value=value.replace("0","");

            if(value.equals("")) {
                answer.add(i);
            }
        }

        if(!answer.isEmpty()){
            arr = new int[answer.size()];
            for(int i=0;i<arr.length;i++){
                arr[i] = answer.get(i);
            }
        }else{
            arr = new int[]{-1};
        }

        //printArr(arr);
        return arr;
    }
}