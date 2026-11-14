import java.util.Scanner;

class Solution {
  private static int minRoute(int[][] map, int col){
    int count=0;

    for(int row=0; row<100; row++){
      if(col-1>=0 && map[row][col-1]==1){
        while(col-1>=0 && map[row][col-1]==1){
          col--;
          count++;
        }
      }else if(col+1<100 && map[row][col+1]==1){
        while(col+1<100 && map[row][col+1]==1){
          count++;
          col++;
        }
      }else{
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 23:17 시작 ~ 23:43 종 료
    dfs로 문제 해결
    main함수에서 row=0이고 col 반복하면서 시작이 0이 아니면 각 열에서 최소값 탐색
    for(int row=0; row<100; row++){
      if(왼쪽 1이면)
        왼쪽으로 이동 && count++
      else if(오른쪽 1이면)
        오른쪽으로 이동 && count++
      else
        count++
    }

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(1) : 자료 상관없이 최악 100*100
    공간 복잡도 : O(1) : 자료 상관없이 100*100

    3. 자료구조
    int[][] map
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    for(int test_case=1; test_case<=10; test_case++){
      int t = sc.nextInt();
      int[][] map = new int[100][100];

      for(int row=0; row<100; row++){
        for(int col=0; col<100; col++){
          map[row][col] = sc.nextInt();
        }
      }

      int minResult = Integer.MAX_VALUE;
      int result=0;

      for(int col=0; col<100; col++){
        if(map[0][col]==0){
          continue;
        }
        int minValue = minRoute(map,col);
        if(minResult>minValue){
          minResult = minValue;
          result = col;
        }
      }

      sb.append("#").append(t).append(" ").append(result).append("\n");
    }
    System.out.print(sb.toString());
  }
}

