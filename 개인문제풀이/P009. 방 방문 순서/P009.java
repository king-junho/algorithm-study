import java.util.*;
public class P009 {
  public int[] solution(int[][] rooms, int start) {
    List<Integer> answer = new ArrayList<>();
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[rooms.length];
    visited[start] = true;
    answer.add(start);
    for (int edge : rooms[start]) {
      queue.add(edge);
      answer.add(edge);
      visited[edge] = true;
    }
    while (!queue.isEmpty()) {
      int next = queue.remove();
      for (int i = 0; i < rooms[next].length; i++) {
        if (!visited[rooms[next][i]]) {
          visited[rooms[next][i]] = true;
          answer.add(rooms[next][i]);
          queue.add(rooms[next][i]);
        }
      }
    }
    return answer.stream().mapToInt(Integer::intValue).toArray();
  }
}
