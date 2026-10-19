import java.util.Arrays;
import java.util.Deque;
import java.awt.Point;
import java.util.ArrayDeque;

class Solution {
    private record Cell(int row, int col){
  }
    public int solution(int[][] maps) {
    Deque<Cell> queue = new ArrayDeque<>();

    int N = maps[0].length;
    int M = maps.length;

    //동서남북
    int dx[] = new int[]{1,-1,0,0};
    int dy[] = new int[]{0,0,1,-1};

    int dist[][] = new int[M][N];
    for(int i=0; i<M; i++){
      Arrays.fill(dist[i],-1);
    }

    dist[0][0]=1;
    queue.offer(new Cell(0, 0));

    while(!queue.isEmpty()){
      Cell current = queue.poll();

      for(int direction=0; direction<4; direction++){
        int nx = current.row + dx[direction];
        int ny = current.col + dy[direction];

        if(nx==N-1 && ny==M-1){
          return dist[current.col][current.row]+1;
        }

        if(nx<0 || nx>=N || ny<0 || ny>=M){
          continue;
        }

        if(dist[ny][nx]!=-1 || maps[ny][nx]!=1){
          continue;
        }

        dist[ny][nx] = dist[current.col][current.row]+1;
        queue.offer(new Cell(nx, ny));
      }
    }
    return -1;
  }
}