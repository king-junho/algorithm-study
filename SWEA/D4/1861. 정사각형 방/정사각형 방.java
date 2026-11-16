import java.awt.*;
import java.util.*;

class Solution {
  //상하좌우
  private static final int[] dr = new int[] {-1,1,0,0};
  private static final int[] dc = new int[] {0,0,-1,1};
  private static int bfs(int[][] rooms,int row, int col){
    int count=0;
    Deque<Point> queue = new ArrayDeque<>();
    queue.offer(new Point(col,row));
    boolean[][] visited = new boolean[rooms.length][rooms[0].length];

    while(!queue.isEmpty()){
      Point current = queue.poll();
      visited[current.y][current.x]=true;
      count++;

      for(int direction=0; direction<4; direction++){
        int nr = current.y+dr[direction];
        int nc = current.x+dc[direction];

        if(nr<0 || nr>=rooms.length || nc<0 || nc>=rooms[0].length){
          continue;
        }
        if(!visited[nr][nc]&&Math.abs(rooms[nr][nc]-rooms[current.y][current.x])==1){
          queue.offer(new Point(nc,nr));
        }
      }
    }
    return count;
  }
  private static void findMaxConnect(int[][] rooms, StringBuilder sb){
    int n = rooms.length;
    int size = n*n;
    int[] counts = new int[size+1];

    for(int row=0; row<n; row++){
      for(int col=0; col<n; col++){
        int roomNum = rooms[row][col];
        counts[roomNum] = bfs(rooms,row,col);
      }
    }

    int maxValue=counts[1];
    int index=1;
    for(int i=2; i<=n*n; i++){
      if(maxValue<counts[i]){
        maxValue=counts[i];
        index=i;
      }
    }

    sb.append(index).append(" ").append(maxValue).append("\n");
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 14:15 시작 ~ 14:41 종 료
    1~N^2까지의 방에서 갈 있는 방 개수 탐색
    for(int i=0; i<n; i++)
      for(int j=0; j<n; j++)
        각 좌표에서 이동가능한 방 개수 구하고 배열에 저장

     for(int i=1; i<=n; i++)
      각 방에서 연결된 방 개수가 최대값 보다 크다면
      (1) 최대값 갱신하고
      (2) idx 갱신



    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N^3*logN) :
    공간 복잡도 : O(N*N) :

    3. 자료구조
    int[][] rooms = new int[][]
    */
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();
      int[][] rooms = new int[n][n];

      for(int row=0; row<n; row++) {
        for(int col=0; col<n; col++) {
          rooms[row][col] = sc.nextInt();
        }
      }

      sb.append("#").append(test_case).append(" ");
      findMaxConnect(rooms,sb);
    }
    System.out.print(sb.toString());

  }
}

