import java.util.Scanner;

class Solution {
  private static void maxLevel(int[] heights, StringBuilder sb){
    int upMax=0;
    int downMax=0;
    for(int i=0; i<heights.length-1; i++){
      int currentHeight =  heights[i];
      int nextHeight = heights[i+1];

      if(currentHeight<=nextHeight){
        upMax = Math.max(upMax,nextHeight-currentHeight);
      }else{
        downMax = Math.max(downMax,currentHeight-nextHeight);
      }
    }
    sb.append(upMax).append(" ").append(downMax).append("\n");
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 12:30 시작 ~ 23:43 종 료
    for(int i=0; i<n-1; i++){
      현재 높이랑 다음 높이
      if(현재 높이 <= 다음 높이)
        upMax = Math.max(upMax, 다음 높이-현재 높이)
      else
        downMax = Math.max(downMax, 현재 높이 - 다음 높이)
    }

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(n) : 자료 상관없이 최악 100*100
    공간 복잡도 : O(n) : 자료 상관없이 100*100

    3. 자료구조
    */
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();
      int heights[] = new int[n];

      for(int i=0; i<n; i++){
        heights[i] = sc.nextInt();
      }

      sb.append("#").append(test_case).append(" ");
      maxLevel(heights,sb);
    }
    System.out.print(sb.toString());

  }
}

