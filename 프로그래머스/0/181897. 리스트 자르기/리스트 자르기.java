import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a=slicer[0];
        int b=slicer[1];
        int c=slicer[2];
        int size = num_list.length;
        List<Integer> list = new ArrayList<>();

        switch(n){
            case 1:
                for(int i=0; i<=b; i++){
                    list.add(num_list[i]);
                }
                break;
            case 2:
                for (int i=a; i<size; i++){
                    list.add(num_list[i]);
                }
                break;
            case 3:
                for(int i=a; i<=b; i++){
                    list.add(num_list[i]);
                }
                break;
            case 4:
                for(int i=a; i<=b; i+=c){
                    list.add(num_list[i]);
                }
                break;


        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}