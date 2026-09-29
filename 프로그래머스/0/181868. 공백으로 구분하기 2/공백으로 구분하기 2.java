import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> ret = new ArrayList<>();
        for(String s : my_string.split(" ")){
            if(!s.isBlank()){
                ret.add(s);
            }
        }

        return ret.toArray(String[] :: new);
    }
}