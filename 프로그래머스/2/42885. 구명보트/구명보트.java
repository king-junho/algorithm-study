import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] people, int limit) {
        Integer[] integerArr = Arrays.stream(people).boxed().toArray(Integer[]::new);
    Arrays.sort(integerArr, Collections.reverseOrder());
    people = Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray();

    int left=0;
    int right=people.length-1;
    int result=0;

    while(left<=right){
      if(people[left]+people[right]<=limit){
        result++;
        left++;
        right--;
      }else{
        result++;
        left++;
      }
    }

    return result;
    }
}