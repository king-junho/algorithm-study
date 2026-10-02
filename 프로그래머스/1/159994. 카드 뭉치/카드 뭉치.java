import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> cards1List = Arrays.stream(cards1).collect(Collectors.toList());
        List<String> cards2List = Arrays.stream(cards2).collect(Collectors.toList());
        String result="Yes";

        for(String word : goal){
            if(!cards1List.isEmpty()&&word.equals(cards1List.getFirst())){
                cards1List.removeFirst();
            }
            else if(!cards2List.isEmpty()&&word.equals(cards2List.getFirst())){
                cards2List.removeFirst();
            }
            else{
                result="No";
                break;
            }
        }

        return result;
    }
}