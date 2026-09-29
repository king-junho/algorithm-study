import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String myString) {
        List<Integer> ret = Arrays.stream(myString.split("x")).mapToInt(String::length).boxed().collect(Collectors.toList());
        if(myString.endsWith("x"))
            ret.add(0);

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}