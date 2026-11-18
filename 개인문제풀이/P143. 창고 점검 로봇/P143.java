import java.awt.*;
import java.util.Scanner;

public class P143 {
  //북, 동, 남, 서
  private static final int[] dr = {-1,0,1,0};
  private static final int[] dc = {0,1,0,-1};

  private static void move(char[][] map, String command, int startRow, int startCol, StringBuilder sb){
    int h = map.length;
    int w = map[0].length;
    boolean[][] visited = new boolean[h][w];
    int visitedCount=0;
    int failCount=0;
    int directionIdx=0;

    visited[startRow][startCol] = true;
    visitedCount++;


    for(int i=0; i<command.length(); i++){
      char c = command.charAt(i);
      switch(c){
        case 'R'->{
          directionIdx = (directionIdx+1)%4;
        }
        case 'L'->{
          directionIdx = directionIdx-1 < 0 ? 3 : directionIdx-1;
        }

        case 'F'->{
          int nr = startRow+dr[directionIdx];
          int nc = startCol+dc[directionIdx];

          if(nr<0 || nr>=h || nc<0 || nc>=w){
            failCount++;
            continue;
          }
          if(map[nr][nc]=='#'){
            failCount++;
            continue;
          }
          if(!visited[nr][nc]){
            visited[nr][nc] = true;
            visitedCount++;
          }
          startRow = nr;
          startCol = nc;

        }

      }

    }
    sb.append(visitedCount).append(" ").append(failCount).append("\n");
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 11:05 시작 ~ 11:27 종 료
    현재칸 1칸으로 시작 visited[처리]

    command 만큼 반복
      1 R이면 방향 idx +1
      2 L이면 방향 idx-1
      3 F이면 다음 칸으로 이동
        (1) 범위 벗어났는지 확인
        (2) 이동 가능한 곳인지 확인
        둘 다 통과되면 이동 후 해당 칸 방문처리 & 이동 횟수++
        아니라면 실패++

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(L+M*N) :
    공간 복잡도 : O(M*N) :

    3. 자료구조
    int[][] map
    boolean[][] visited
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int h = sc.nextInt();
      int w = sc.nextInt();
      char[][] map = new char[h][w];
      int startRow=0;
      int startCol=0;
      String commmand;

      for(int row=0; row<h; row++) {
        String line = sc.next();
        for(int col=0; col<w; col++) {
          char c = line.charAt(col);
          if(c=='S'){
            startRow = row;
            startCol = col;
          }
          map[row][col] = c;
        }
      }
      commmand = sc.next();

      sb.append("#").append(test_case).append(" ");
      move(map,commmand,startRow,startCol,sb);
    }
    System.out.print(sb.toString());

  }
}

