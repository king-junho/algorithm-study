import java.util.Scanner;

class Solution {
  //상하좌우
  private static final int[] straightDr = new int[]{-1,1,0,0};
  private static final int[] straightDc = new int[]{0,0,-1,1};
  //오위, 오아, 왼아, 왼위
  private static final int[] diagonaDr = new int[]{-1,1,1,-1};
  private static final int[] diagonaDc = new int[]{1,1,-1,-1};

  private static int maxKill(int[][] map, int m){
    int maxValue=0;
    int n = map.length;

    for(int row=0; row<n; row++){
      for(int col=0; col<n; col++){
        int diagonaSum=map[row][col];
        int straightSum=map[row][col];

        for(int direction=0; direction<4; direction++){
          for(int i=1; i<=m-1; i++){
            int straightRow = row+straightDr[direction]*i;
            int straightCol = col+straightDc[direction]*i;

            if(straightRow>=0 && straightRow<n && straightCol>=0 && straightCol<n){
              straightSum+=map[straightRow][straightCol];
            }

            int diagonaRow = row+diagonaDr[direction]*i;
            int diagonaCol = col+diagonaDc[direction]*i;

            if(diagonaRow>=0 && diagonaRow<n && diagonaCol>=0 && diagonaCol<n){
              diagonaSum+=map[diagonaRow][diagonaCol];
            }
          }
        }
        maxValue=Math.max(maxValue,Math.max(straightSum,diagonaSum));
      }
    }

    return maxValue;
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 17:30 시작 ~ 15:40 종 료
    각 칸에서 M칸만큼 (1) 상하좌우 (2) 대각선으로 돌면서 잡은 파리 최대값 갱신
    //상하좌우
    straightDr = {-1,1,0,0}
    straightDc = {0,0,-1,1}

    오위, 오아, 왼아, 왼위
    diagonaDr = {-1,1,1,-1}
    diagonaDc = {1,1,-1,-1}

    diagonaSum=0;
    straightSum=0;

    (1)상하좌우
    for(int direction=0; direction<4; direction++)
      for(int i=0; i<m; i++)
        위, 오, 아, 왼 으로 이동하면서 합계 구하기
        오위, 오아, 왼아, 왼위 이동하면서 합계 구하기
      현재합계가 기존 최대값보다 크면 갱신

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N*N*M)
    공간 복잡도 : O(N*N)

    3. 자료구조
    String[] lines
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[][] map = new int[n][n];

      for(int row=0; row<n; row++) {
        for(int col=0; col<n; col++) {
          map[row][col] = sc.nextInt();
        }
      }

      sb.append("#").append(test_case).append(" ").append(maxKill(map,m)).append("\n");
    }
    System.out.print(sb.toString());
  }



}

