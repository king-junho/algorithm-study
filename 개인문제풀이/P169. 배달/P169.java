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


public class P169 {
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
                if(nextWeight>=dist[next.to]){
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

    public static void main(String[] args) throws Exception {
    /*
    1.20:40 시작 ~ 21:00분 스탑

    다익스트라 문제 현재 위치에서 다른 위치까지의 최소 거리
    findVillage(graph, dist, k);

    1번 마을부터 시작
    1번 마을 Queue에 넣고
    거리0 으로 설정

    queue가 없을 때까지 더 이상 연결된 간선이 없을 때까지 반복
        현재 가장 최단거리인 노드 가져오고
        해당 노드가 기존 거리보다 작으면
        거리 갱신하고 해동 노드와 연결된 도로 확인
        다음거리가 기존거리보다 작으면 거리 갱신하고 다음 Node값 pq에 넣기
    1 마을에서 연결된 각 마을까지의 최단거리 다 완료됐으면
    마을 돌면서 limit보다 작은 지점 count


    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N!) :
    공간 복잡도 : O(N) :

    3. 자료구조
    */
        int N = 6;
        int[][] road = {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{5,6,1}};
        int k =4;
        Solution s = new Solution();
        System.out.println(s.solution(N, road,k));
  }
}
