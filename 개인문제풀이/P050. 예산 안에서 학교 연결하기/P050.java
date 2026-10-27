import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
class Edge implements Comparable {
    int to;
    int weight;
    public Edge(int to, int weight) { this.to = to; this.weight = weight; }
    @Override public int compareTo(Object e) { return Integer.compare(weight, ((Edge)e).weight); }
}
public class P050 {
    private static long msp(List<List<Edge>> graph, long K) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.add(new Edge(1, 0));
        long totalWeight = 0;
        int count = 0;
        int n = graph.size() - 1;
        boolean[] visited = new boolean[n + 1];
        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            if (count == n) { break; }
            if (!visited[current.to]) {
                visited[current.to] = true;
                totalWeight += current.weight;
                count++;
                if (totalWeight > K) { return -1; }
                for (Edge next : graph.get(current.to)) {
                    if (!visited[next.to]) { pq.add(next); }
                }
            }
        }
        return count != n ? -1 : totalWeight;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            long K = sc.nextLong();
            List<List<Edge>> graph = new ArrayList<>();
            for (int i = 0; i <= N; i++) { graph.add(new ArrayList<>()); }
            for (int i = 0; i < M; i++) {
                int from = sc.nextInt(), to = sc.nextInt(), weight = sc.nextInt();
                graph.get(from).add(new Edge(to, weight));
                graph.get(to).add(new Edge(from, weight));
            }
            System.out.println("#" + test_case + " " + msp(graph, K));
        }
    }
}
