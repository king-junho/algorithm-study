import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P020 {
  public void backtrack(int n, int start, int depth, int[] path,
                        List<int[]> result, int target) {
    if (depth == path.length) {
      if (Arrays.stream(path).sum() == target) {
        result.add(path.clone());
      }
      return;
    }
    int remaining = path.length - depth;
    int lastCandicate = n - remaining + 1;
    for (int number = start; number <= lastCandicate; number++) {
      path[depth] = number;
      backtrack(n, number + 1, depth + 1, path, result, target);
    }
  }

  public int[][] solution(int n, int m, int target) {
    List<int[]> result = new ArrayList<>();
    int[] path = new int[m];
    backtrack(n, 1, 0, path, result, target);
    return result.isEmpty() ? new int[][]{} : result.toArray(new int[result.size()][]);
  }
}
