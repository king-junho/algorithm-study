import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    int to;
    int dist;

    Edge(int to, int dist) {
        this.to = to;
        this.dist = dist;
    }

    @Override
    public int compareTo(Edge o){
        return Integer.compare(this.dist, o.dist);
    }
}

public class P159 {
    private static long minDist(List<List<Edge>> graph){
        int n = graph.size()-1;
        long total=0;
        int count=0;
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[n+1];
        pq.offer(new Edge(1,0));

        while(!pq.isEmpty()){
            Edge current = pq.poll();

            if(visited[current.to]){
                continue;
            }

            visited[current.to] = true;
            total+=current.dist;
            count++;

            if(count==n){
                break;
            }

            for(Edge next : graph.get(current.to)){
                if(!visited[next.to]){
                    pq.offer(next);
                }

            }

        }


        return count==n ? total : -1;
    }
    public static void main(String[] args) throws Exception {
    /*
    1.15:20 시작 ~ 15:27
    MST 최소 연결 비용
    인전 노드 리스트를 그래프에 담고
    1번부터 시작해서 거리 순으로 정렬된 pq에 넣고 pq 빌 때까지 반복


    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N+M) :
    공간 복잡도 : O(N+M) :

    3. 자료구조
    List<List<Edge>> graph
    */


        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for(int test_case=1; test_case<=t; test_case++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            List<List<Edge>> graph = new ArrayList<>();

            for(int i=0; i<=n; i++){
                graph.add(new ArrayList<>());
            }

            for(int i=0; i<m; i++){
                int from = sc.nextInt();
                int to =  sc.nextInt();
                int dist =  sc.nextInt();

                graph.get(from).add(new Edge(to, dist));
                graph.get(to).add(new Edge(from, dist));
            }

            sb.append("#").append(test_case).append(" ")
                    .append(minDist(graph)).append("\n");
        }
        System.out.print(sb.toString());
  }
}
