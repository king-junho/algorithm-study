import java.util.ArrayList;
import java.util.List;
public class P018 {
  public int[][] solution(int n, int m) {
    List<int[]> result = new ArrayList<>();
    int[] path = new int[m];
    boolean[] visited = new boolean[n + 1];
    backtrack(n, 0, path, visited, result);
    return result.toArray(new int[result.size()][]);
  }
  public void backtrack(int n, int depth, int[] path,
                         boolean[] visited, List<int[]> result) {
    if (depth == path.length) {
      result.add(path.clone());
      return;
    }
    for (int number = 1; number <= n; number++) {
      if (visited[number]) continue;
      visited[number] = true;
      path[depth] = number;
      backtrack(n, depth + 1, path, visited, result);
      visited[number] = false;
    }
  }
}
