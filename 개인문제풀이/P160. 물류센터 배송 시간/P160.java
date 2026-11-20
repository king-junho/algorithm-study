import java.util.*;


class Node implements Comparable<Node> {
    int idx;
    long weight;

    public Node(int idx, long weight) {
        this.idx = idx;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return Long.compare(this.weight, o.weight);
    }
}
class Edge implements Comparable<Edge> {
    int to;
    int weight;

    public Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return Integer.compare(this.weight, o.weight);
    }
}

public class P160 {
    private static void dijkstra(List<List<Edge>> graph, int start, StringBuilder sb){
        int n = graph.size()-1;
        long[] dist = new long[n+1];
        Arrays.fill(dist, Long.MAX_VALUE);
        PriorityQueue<Node> pq = new PriorityQueue<>();

        pq.offer(new Node(start,0));
        dist[start]=0;

        while(!pq.isEmpty()){
            Node current = pq.poll();

            if(current.weight>dist[current.idx]){
                continue;
            }

            for(Edge next : graph.get(current.idx)){
                long nextWeight = current.weight+next.weight;
                if(nextWeight<dist[next.to]){
                    dist[next.to] = nextWeight;
                    pq.offer(new Node(next.to, nextWeight));
                }
            }
        }

        for(int i=1; i<=n; i++){
            if(dist[i]==Long.MAX_VALUE){
                sb.append("-1 ");
            }else{
                sb.append(dist[i]).append(" ");
            }
        }
        sb.append("\n");
    }
    public static void main(String[] args) throws Exception {
    /*
    1.15:35 시작 ~ 15:48
    다익스트라 특정 위치에서 다른 위치까지의 최소거리

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(ElogV) :
    공간 복잡도 : O(E+V) :

    3. 자료구조
    List<List<Edge>> graph
    */


        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for(int test_case=1; test_case<=t; test_case++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();

            List<List<Edge>> graph = new ArrayList<>();

            for(int i=0; i<=n; i++){
                graph.add(new ArrayList<>());
            }

            for(int i=0; i<m; i++){
                int from = sc.nextInt();
                int to = sc.nextInt();
                int weight = sc.nextInt();

                graph.get(from).add(new Edge(to, weight));
            }

            sb.append("#").append(test_case).append(" ");
            dijkstra(graph,s,sb);
        }
        System.out.print(sb.toString());
  }
}
