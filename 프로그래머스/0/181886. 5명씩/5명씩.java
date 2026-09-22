import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        int idx=0;

        for(String name : names){
            if(idx==0){
                list.add(name);
            }
            idx=(idx+1)%5;
        }
        return list.stream().toArray(String[]::new);
    }
}