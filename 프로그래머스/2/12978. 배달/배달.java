import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Edge{
    int to;
    int weight;
    public Edge(int to, int weight){
        this.to = to;
        this.weight = weight;
    }
}

class Node implements Comparable<Node>{
    int idx;
    int weight;

    Node(int idx, int weight){
        this.idx = idx;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(weight, o.weight);
    }
}


class Solution {
    private int findVillage(List<List<Edge>> graph, int[] dist, int limit){
        int count=0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(1,0));
        dist[1]=0;

        while(!pq.isEmpty()){
            Node current = pq.poll();

            if(current.weight>dist[current.idx]){
                continue;
            }

            dist[current.idx] = current.weight;

            for(Edge next : graph.get(current.idx)){
                int nextWeight = current.weight+next.weight;
                if(nextWeight>dist[next.to]){
                    continue;
                }
                dist[next.to] = nextWeight;
                pq.offer(new Node(next.to, nextWeight));
            }
        }

        for(int i=1; i<dist.length; i++){
            if(dist[i]<=limit){
                count++;
            }
        }

        return count;
    }
    public int solution(int N, int[][] road, int K) {
        List<List<Edge>> graph = new ArrayList<>();
        int[] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<road.length; i++) {
            int from = road[i][0];
            int to = road[i][1];
            int weight = road[i][2];

            graph.get(from).add(new Edge(to, weight));
            graph.get(to).add(new Edge(from, weight));
        }

        return findVillage(graph, dist, K);
    }
}