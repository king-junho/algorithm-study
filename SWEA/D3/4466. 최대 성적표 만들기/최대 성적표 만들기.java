import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Solution {
  private static int findMaxScore(int[] scores, int k){
    int maxScore=0;
    Arrays.sort(scores);

    int lastIndex = scores.length-1;
    for(int i=lastIndex; i>lastIndex-k; i--){
      maxScore+=scores[i];
    }
    return maxScore;
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 14:00 시작 ~ 13:55 종 료
    점수 총점 정렬하고, K개수만큼 더한값 반환

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(NlogN)
    공간 복잡도 : O(N)

    3. 자료구조
    int[] scores
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] scores = new int[n];

      for(int i=0; i<n; i++){
        scores[i] = sc.nextInt();
      }

      sb.append("#").append(test_case).append(" ").append(findMaxScore(scores,k)).append("\n");

    }
    System.out.print(sb.toString());
  }

}

