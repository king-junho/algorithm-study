import java.util.ArrayList;
import java.util.List;

public class P018 {
  private boolean[] visited;
  private List<int[]> result;
  private List<Integer> list;
  private int N, M;

  public void recursion(int num) {
    if (num == M) {
      result.add(list.stream().mapToInt(Integer::intValue).toArray());
      return;
    }
    for (int i = 1; i <= N; i++) {
      if (!visited[i]) {
        visited[i] = true;
        list.add(i);
        recursion(num + 1);
        visited[i] = false;
        list.removeLast();
      }
    }
  }

  public int[][] solution(int n, int m) {
    N = n;
    M = m;
    visited = new boolean[n + 1];
    list = new ArrayList<>();
    result = new ArrayList<>();
    recursion(0);
    return result.toArray(new int[result.size()][]);
  }
}
