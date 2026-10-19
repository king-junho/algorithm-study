public class P016 {
  public static int N, M;

  public void dfs(int[][] grid, boolean[][] visited, int row, int col) {
    int[] dx = new int[]{1, -1, 0, 0};
    int[] dy = new int[]{0, 0, 1, -1};
    if (visited[col][row]) {
      return;
    }
    visited[col][row] = true;
    for (int direction = 0; direction < 4; direction++) {
      int nx = row + dx[direction];
      int ny = col + dy[direction];
      if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
        continue;
      }
      if (visited[ny][nx] || grid[ny][nx] == 0) {
        continue;
      }
      dfs(grid, visited, nx, ny);
    }
  }

  public int solution(int[][] grid) {
    N = grid[0].length;
    M = grid.length;
    int answer = 0;
    boolean[][] visited = new boolean[M][N];
    for (int col = 0; col < M; col++) {
      for (int row = 0; row < N; row++) {
        if (!visited[col][row] && grid[col][row] == 1) {
          answer++;
          dfs(grid, visited, row, col);
        }
      }
    }
    return answer;
  }
}
