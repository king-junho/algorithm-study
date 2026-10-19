import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class P010 {
  public int solution(int[][] rooms, int start, int target) {
    // rooms[start][i]를 돌면서 연결된 문들 queue에 넣는다
    // current = queue.poll 하면서 이동 횟수++한다
    // 만약 rooms[current][i]에서 target이 나오면 stop 없으면 -1
    int move = 0;
    Queue<Integer> queue = new ArrayDeque<>();
    int[] dist = new int[rooms.length];
    Arrays.fill(dist, -1);

    if (start == target) {
      return 0;
    }

    queue.offer(start);
    dist[start] = 0;

    while (!queue.isEmpty()) {
      int current = queue.poll();
      for (int i = 0; i < rooms[current].length; i++) {
        if (rooms[current][i] == target) {
          return dist[current] + 1;
        }
        if (dist[rooms[current][i]] == -1) {
          queue.offer(rooms[current][i]);
          dist[rooms[current][i]] = dist[current] + 1;
        }
      }
    }
    return -1;
  }
}
