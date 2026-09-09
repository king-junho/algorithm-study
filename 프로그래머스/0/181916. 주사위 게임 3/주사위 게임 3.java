import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        TreeSet<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        if(set.size()==1){
            answer = list.stream().findFirst().get()*1111;
        }
        else if(set.size()==2){
            int first = set.first();
            int second = set.last();

            int count = (int)list.stream().filter(i->i==first).count();
            if(count==1){
                answer = (int)Math.pow(10*second+first,2);
            }else if(count==3){
                answer = (int)Math.pow(10*first+second,2);
            }
            else{
                answer = (first+second) * (Math.abs(first-second));
            }
        }
        else if(set.size()==3){
            answer = 1;
            for(int x : set){
                if(list.stream().filter(i -> i==x).count()!=2){
                    answer*=x;
                }
            }
        }
        else{
            answer = list.stream().min(Integer::compareTo).get();
        }
        return answer;
    }
}