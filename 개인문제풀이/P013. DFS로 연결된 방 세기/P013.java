public class P013 {
  private int answer;

  public int solution(int[][] rooms, int start) {
    answer = 0;
    boolean[] visited = new boolean[rooms.length];
    visited[start] = true;
    dfs(rooms, visited, start);
    return answer;
  }

  private void dfs(int[][] rooms, boolean[] visited, int current) {
    answer++;
    for (int next : rooms[current]) {
      if (!visited[next]) {
        visited[next] = true;
        dfs(rooms, visited, next);
      }
    }
  }
}
