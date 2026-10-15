import java.util.stream.IntStream;
import java.util.TreeMap;

class Solution {
    public int[] solution(int N, int[] stages) {
        TreeMap<Integer, Integer> stagesPeople = new TreeMap<>();
    double[] failureRate = new double[N+1];
    double remainPeopleCnt = stages.length;

    for(int stage : stages){
      stagesPeople.put(stage, stagesPeople.getOrDefault(stage, 0)+1);
    }

    for(int i=1; i<=N; i++){
        if(remainPeopleCnt <=0 ){
            failureRate[i]=0;
            continue;
        }
      failureRate[i] = (double)(stagesPeople.getOrDefault(i,0)/remainPeopleCnt);
      remainPeopleCnt -= stagesPeople.getOrDefault(i,0);
    }
    
    return IntStream.range(1,failureRate.length).boxed().sorted((i,j)->Double.compare(failureRate[j],failureRate[i])).mapToInt(Integer::intValue).toArray();
    }
}