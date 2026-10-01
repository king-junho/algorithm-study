import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] res = myStr.split("[a-c]");
        res = Arrays.stream(res).filter(s->!s.isEmpty()).toArray(String[]::new);

        if (res.length ==0)
            return new String[]{"EMPTY"};

        return res;
    }
}