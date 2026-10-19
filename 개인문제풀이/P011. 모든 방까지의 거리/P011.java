import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class P011 {
  public int[] solution(int[][] rooms, int start) {
    Deque<Integer> queue = new ArrayDeque<>();
    int[] dist = new int[rooms.length];
    Arrays.fill(dist, -1);
    queue.add(start);
    dist[start] = 0;

    while (!queue.isEmpty()) {
      int current = queue.poll();
      for (int i = 0; i < rooms[current].length; i++) {
        if (dist[rooms[current][i]] == -1) {
          queue.offer(rooms[current][i]);
          dist[rooms[current][i]] = dist[current] + 1;
        }
      }
    }
    return dist;
  }
}
