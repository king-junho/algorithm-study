public class P017 {
  private static final int[] dx = {1, -1, 0, 0};
  private static final int[] dy = {0, 0, 1, -1};
  int N, M;

  public int dfs(int[][] grid, boolean[][] visited, int row, int col) {
    if (row < 0 || row >= N || col < 0 || col >= M) {
      return 0;
    }
    if (visited[col][row] || grid[col][row] == 0) {
      return 0;
    }
    visited[col][row] = true;
    int area = 1;
    for (int direction = 0; direction < 4; direction++) {
      int nx = row + dx[direction];
      int ny = col + dy[direction];
      area += dfs(grid, visited, nx, ny);
    }
    return area;
  }

  public int solution(int[][] grid) {
    N = grid[0].length;
    M = grid.length;
    int answer = 0;
    boolean[][] visited = new boolean[M][N];
    for (int col = 0; col < M; col++) {
      for (int row = 0; row < N; row++) {
        if (!visited[col][row] && grid[col][row] != 0) {
          answer = Math.max(dfs(grid, visited, row, col), answer);
        }
      }
    }
    return answer;
  }
}
