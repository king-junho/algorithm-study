import java.util.ArrayList;
import java.util.List;

public class P014 {
  public List<Integer> answer;

  public void dfs(int[][] rooms, boolean[] visited, int index) {
    answer.add(index);
    for (int i = 0; i < rooms[index].length; i++) {
      int next = rooms[index][i];
      if (!visited[next]) {
        visited[next] = true;
        dfs(rooms, visited, next);
      }
    }
  }

  public int[] solution(int[][] rooms, int start) {
    boolean[] visited = new boolean[rooms.length];
    answer = new ArrayList<>();
    visited[start] = true;
    dfs(rooms, visited, start);
    return answer.stream().mapToInt(Integer::intValue).toArray();
  }
}
