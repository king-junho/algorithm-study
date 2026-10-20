import java.util.ArrayList;
import java.util.List;

public class P020 {
  public void backtrack(int n, int start, int depth, int[] path,
                        List<int[]> result, int target, int sum) {
    if (depth == path.length) {
      if (sum == target) {
        result.add(path.clone());
      }
      return;
    }
    int remaining = path.length - depth;
    int lastCandicate = n - remaining + 1;
    for (int number = start; number <= lastCandicate; number++) {
      path[depth] = number;
      sum += number;
      backtrack(n, number + 1, depth + 1, path, result, target, sum);
      sum -= number;
    }
  }

  public int[][] solution(int n, int m, int target) {
    List<int[]> result = new ArrayList<>();
    int[] path = new int[m];
    backtrack(n, 1, 0, path, result, target, 0);
    return result.isEmpty() ? new int[][]{} : result.toArray(new int[result.size()][]);
  }
}
