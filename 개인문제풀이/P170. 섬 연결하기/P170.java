import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Edge implements Comparable<Edge>{
    int to;
    int weight;

    public Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return Integer.compare(weight, o.weight);
    }
}

public class P170 {
    private int minDist(List<List<Edge>> graph, boolean[] visited){
        int totalCost=0;
        int count=0;
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(0,0));

        while(!pq.isEmpty()){
            Edge current = pq.poll();

            if(visited[current.to]){
                continue;
            }

            visited[current.to]=true;
            totalCost+=current.weight;
            count++;

            if(count==visited.length){
                break;
            }

            for(Edge next : graph.get(current.to)){
                if(!visited[next.to]){
                    pq.offer(next);
                }
            }
        }

        return totalCost;
    }
    public int solution(int n, int[][] costs) {
        List<List<Edge>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<costs.length; i++){
            int from = costs[i][0];
            int to = costs[i][1];
            int weight = costs[i][2];

            graph.get(from).add(new Edge(to, weight));
            graph.get(to).add(new Edge(from, weight));
        }

        return minDist(graph,visited);
    }

    public static void main(String[] args) throws Exception {
    /*
    1.21:30 시작 ~ 21:40분 스탑
    //cost가 int범위, totalCost가 int 범위라고 가정하고 문제 풀이
    MST 문제
    0부터 시작
    queue에 0 넣고 시작
    queue가 빌 때까지
    if(visited)
        continue;
    visited[true]
    누적 합+=현재 지점에 있는 값
    count++

    현재 위치와 연결된 간선들 확인
        queue에 넣기


    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N+M) : M은 간선의 길이
    공간 복잡도 : O(N+M) : M은 간선의 길이

    3. 자료구조
    List<List<Edge>> graph
    boolean[] visited
    */
        int n = 4;
        int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
        Solution s = new Solution();
        System.out.println(s.solution(n,costs));
  }
}
