import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n+1];
    int result=0;

    Arrays.fill(clothes,1);

    for(int i=0; i<lost.length; i++){
      clothes[lost[i]]--;
    }
    for(int i=0; i<reserve.length; i++){
      clothes[reserve[i]]++;
    }

    for(int i=1; i<clothes.length; i++){
      if(clothes[i]==0){
        if(clothes[i-1]==2){
          clothes[i-1]--;
          clothes[i]++;
        }
        else if(i+1<clothes.length && clothes[i+1]==2){
          clothes[i]++;
          clothes[i+1]--;
        }
      }

      if(clothes[i]>0)
        result++;

    }

    return result;
    }
}