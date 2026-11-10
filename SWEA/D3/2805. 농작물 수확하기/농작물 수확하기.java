import java.util.*;

class Solution {
  private static int harvest(int[][] map){
    int sum=0;
    int n = map.length;

    for(int i=0; i<n; i++){
      int size = i<=n/2 ? 2*i+1 : 2*(n-1-i)+1;
      int mid = n/2;
      int startIdx=Math.abs(mid-i);
      int idx=0;

      while(size>0){
        sum+=map[i][startIdx+idx];
        size--;
        idx++;
      }
    }

    return sum;
  }
  public static void main(String[] args) throws Exception{
    /*
    1. 14:20 시작 ~ 14:51 종 료
    커져가고 작아지는 것 for문으로 계산
    int sum=0;
    for(i=0; i<n i++){
      int size = i<=n/2 ? 1+2*i : 1+2(n-1-i)
      int mid = n/2;

      while(size>0){
        sum+=Math.abs(mid-i)
        size--;
      }
    }

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N^2)
    공간 복잡도 : O(N^2)

    3. 자료구조
    */
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++){
      int n = sc.nextInt();
      int[][] map = new int[n][n];

      for(int i=0; i<n; i++){
        String line = sc.next();
        for(int j=0; j<n; j++){
          map[i][j] = line.charAt(j)-'0';
        }
      }

      sb.append("#").append(test_case).append(" ").append(harvest(map)).append("\n");
    }
    System.out.print(sb.toString());
  }
}
