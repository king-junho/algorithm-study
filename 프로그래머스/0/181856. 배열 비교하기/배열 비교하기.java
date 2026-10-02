import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1=0, sum2=0;
        if (arr1.length != arr2.length) {
            return arr1.length>arr2.length?1:-1;
        }else{
            sum1 = Arrays.stream(arr1).sum();
            sum2 = Arrays.stream(arr2).sum();
            if(sum1==sum2){
                return 0;
            }else{
                return sum1>sum2?1:-1;
            }
        }
    }
}