import java.util.*;

public class P140 {
  private static int mst(List<List<Integer>> graph, int start,int[] nodes){
    Deque<Integer> queue = new ArrayDeque<>();

    queue.offer(start);
    nodes[start] = 1;

    while(!queue.isEmpty()){
      int current = queue.poll();

      for(int next : graph.get(current)){
        if(nodes[next]!=0){
          continue;
        }
        nodes[next] = nodes[current]+1;
        queue.offer(next);
      }
    }

    int maxValue=0;
    int result=0;
    for(int i=1; i<=100; i++){
      if(maxValue<=nodes[i]){
        maxValue=nodes[i];
        result=i;
      }
    }
    return result;
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 12:57 시작 ~ 13:17 종 료
    MST 이용
    시작 노드 큐에 넣고 해당 노드 순서 1로 초기화

    while(큐가 빌때까지)
      현재 큐에 연결된 간선들 탐색 후 방문하지 않았으면
        (1) 큐에 넣기
        (2) 현재 값에다가 +1 한 값 node 값에다가 넣기(연락 순서)

     for(int 1=0; node<100; i++)
      현재 노드 값이 최대값 이상이면 idx 갱신

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N+M) :
    공간 복잡도 : O(N+M) :

    3. 자료구조
    */
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    for(int test_case=1; test_case<=10; test_case++) {
      int n = sc.nextInt();
      int start = sc.nextInt();
      List<List<Integer>> graph = new ArrayList<>();
      int[] nodes = new int[101];
      for(int i=0; i<=100; i++){
        graph.add(new ArrayList<>());
      }

      for(int i=0; i<n/2; i++){
        int from =  sc.nextInt();
        int to = sc.nextInt();

        graph.get(from).add(to);
      }

      sb.append("#").append(test_case).append(" ").append(mst(graph,start,nodes)).append("\n");
    }
    System.out.print(sb.toString());

  }
}

