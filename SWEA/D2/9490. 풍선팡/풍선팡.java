import java.util.Scanner;

class Solution {
  //상하좌우
  private static final int[] dr = new int[]{-1,1,0,0};
  private static final int[] dc = new int[]{0,0,-1,1};

  private static int maxLeaf(int[][] map){
    int best=0;
    int H = map.length;
    int W = map[0].length;
    for(int row=0; row<H; row++){
      for(int col=0; col<W; col++){
        int count = map[row][col];
        int sum=count;

        for(int direction=0; direction<4; direction++){
          for(int i=1; i<=count; i++){
            int nr = row+dr[direction]*i;
            int nc = col+dc[direction]*i;

            if(nr>=0 && nr<H && nc>=0 && nc<W){
              sum+=map[nr][nc];
            }
          }
        }
        best=Math.max(best,sum);
      }
    }
    return best;
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 18:10 시작 ~ 18:00 종 료
    N*M칸 돌면서 탐색
      해당 칸에서 sum=0;
      해당 칸의 꽃잎 개수만큼 상하좌우 탐색
        해당 칸이 범위 안에 꽃잎이라면 sum+=현재 칸 꽃잎 수
      best=Math.max(best,sum)
    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N*M*A)
    공간 복잡도 : O(N*M)

    3. 자료구조
    int[][] map
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[][] map = new int[n][m];

      for(int row=0; row<n; row++) {
        for(int col=0; col<m; col++) {
          map[row][col] = sc.nextInt();
        }
      }


      sb.append("#").append(test_case).append(" ").append(maxLeaf(map)).append("\n");
    }
    System.out.print(sb.toString());
  }



}

