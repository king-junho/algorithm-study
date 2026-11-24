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

class Solution {
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
}