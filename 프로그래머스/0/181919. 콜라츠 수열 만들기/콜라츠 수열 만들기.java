import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        do{
            list.add(n);
            if(n%2==0){
                n/=2;
            }else{
                n=(n*3)+1;
            }
        }while(n!=1);
        
        list.add(1);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}