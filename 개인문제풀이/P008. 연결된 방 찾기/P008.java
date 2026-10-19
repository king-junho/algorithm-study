import java.util.Queue;
import java.util.LinkedList;
public class P008 {
  public int solution(int[][] rooms){
    int answer = 1;
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[rooms.length];
    visited[0] = true;
    for(int i=0; i<rooms[0].length; i++){
      queue.add(rooms[0][i]);
      visited[rooms[0][i]]=true;
      answer++;
    }
    while(!queue.isEmpty()){
      int n = queue.remove();
      for(int i=0; i<rooms[n].length; i++){
        if(!visited[rooms[n][i]]){
          queue.add(rooms[n][i]);
          answer++;
          visited[rooms[n][i]]=true;
        }
      }
    }
    return answer;
  }
}
