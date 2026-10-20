import java.util.*;
public class P019 {
  public void backtrack(int n, int current, int depth, int[] path, boolean[] visited, List<int[]> result) {
    if (n - current + 1 < path.length - depth) return;
    if (depth == path.length) {result.add(path.clone());return;}
    for (int number = current; number <= n; number++) {
      if (visited[number]) continue;
      visited[number] = true;
      path[depth] = number;
      backtrack(n, number + 1, depth + 1, path, visited, result);
      visited[number] = false;
    }
  }
  public int[][] solution(int n, int m) {
    boolean[] visited = new boolean[n + 1];
    int[] path = new int[m];
    List<int[]> result = new ArrayList<>();
    backtrack(n, 1, 0, path, visited, result);
    return result.toArray(new int[result.size()][]);
  }
}
