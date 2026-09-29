import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] result = new int[photo.length];
        int index=0;
        HashMap<String, Integer> nameYearing = new HashMap<>();

        for(int i=0; i<name.length; i++){
            nameYearing.put(name[i],yearning[i]);
        }

        for(String[] p : photo){
            result[index++]=Arrays.stream(p).filter(s-> nameYearing.containsKey(s)).mapToInt(s->nameYearing.get(s)).sum();
        }
    
        return result;
    }
}