import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        int[] result = new int[targets.length];
        int index=0;

        for(String key : keymap){
            for(int i =0; i< key.length(); i++){
                char c = key.charAt(i);
                map.put(c,Math.min(map.getOrDefault(c,Integer.MAX_VALUE),i+1));
            }
        }
    

        for (String target : targets) {
            int sum=0;
            for(int i=0;i<target.length();i++){
                char c = target.charAt(i);
                if(!map.containsKey(c)){
                    sum=0;
                    break;
                }
                sum+=map.getOrDefault(c,0);
            }
            result[index++] = (sum!=0) ? sum : -1;
        }
        return result;
    }
}