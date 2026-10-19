import java.util.Arrays;
import java.util.Deque;
import java.awt.Point;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[][] maps) {
    //dx,dy로 동서남북 선언
    //dist[][] -1로 초기화
    //각 map의 위치 (x,y)마다 동서남북 탐색 -> 벽(0)이 아니고 n,m미만이라면 거리 current거리 +1
    //if nx ny == n-1 , m-1 이면 그 때 거리 반환

    //가로 N, 세로 M
    int N=maps[0].length;
    int M=maps.length;

    //동서남북
    int[] dx = new int[]{1,-1,0,0};
    int[] dy = new int[]{0,0,1,-1};

    int[][] dist = new int[M][N];

    Deque<Point> queue = new ArrayDeque<>();

    queue.offer(new Point(0, 0));
    for(int i=0; i<M; i++){
      Arrays.fill(dist[i], -1);
    }

    dist[0][0] = 1;

    while(!queue.isEmpty()){
      Point current=queue.poll();

      for(int i=0; i<4; i++){
        int nx = current.x + dx[i];
        int ny = current.y + dy[i];

        if((0<=nx && nx<N) && (0<=ny && ny<M) && dist[ny][nx]==-1 && maps[ny][nx]==1){
          queue.offer(new Point(nx, ny));
          dist[ny][nx] = dist[current.y][current.x]+1;
        }
      }
    }
    
    return dist[M-1][N-1];
  }
}