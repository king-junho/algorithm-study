import java.util.*;

class Solution {
    enum TYPE{
        code,
        date,
        maximum,
        remain
    }
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
    
        List<int[]> answer=new ArrayList<>();

        for(int[] row : data){
            int ext_idx = TYPE.valueOf(ext).ordinal();
            if(row[ext_idx] < val_ext)
                answer.add(row);
        }
        int sort_idx = TYPE.valueOf(sort_by).ordinal();

        answer.sort(Comparator.comparingInt(o->o[sort_idx]));
        return answer.stream().toArray(int[][]::new);
    }
}