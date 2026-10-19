public class P015 {
  public void dfs(int[][] rooms, boolean[] visited, int index) {
    if (visited[index]) {
      return;
    }
    visited[index] = true;
    for (int i = 0; i < rooms[index].length; i++) {
      int next = rooms[index][i];
      dfs(rooms, visited, next);
    }
  }

  public int solution(int[][] rooms) {
    boolean[] visited = new boolean[rooms.length];
    int answer = 0;
    for (int i = 0; i < rooms.length; i++) {
      if (!visited[i]) {
        answer++;
        dfs(rooms, visited, i);
      }
    }
    return answer;
  }
}
