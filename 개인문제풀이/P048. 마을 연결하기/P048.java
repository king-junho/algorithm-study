import java.util.*;
class Edge implements Comparable<Edge> {
 int to, weight;
 public Edge(int to,int weight){this.to=to;this.weight=weight;}
 public int compareTo(Edge o){return Integer.compare(weight,o.weight);}
}
public class P048 {
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in); int T=sc.nextInt();
  for(int test_case=1;test_case<=T;test_case++){
   int N=sc.nextInt(),M=sc.nextInt();
   List<List<Edge>> graph=new ArrayList<>();
   for(int i=0;i<=N;i++)graph.add(new ArrayList<>());
   for(int i=0;i<M;i++){
    int from=sc.nextInt(),to=sc.nextInt(),weight=sc.nextInt();
    graph.get(from).add(new Edge(to,weight));graph.get(to).add(new Edge(from,weight));
   }
   int totalWeight=0;boolean[] visited=new boolean[N+1];PriorityQueue<Edge> pq=new PriorityQueue<>();
   pq.add(new Edge(1,0));
   while(!pq.isEmpty()){
    Edge current=pq.poll();
    if(!visited[current.to]){
     visited[current.to]=true;totalWeight+=current.weight;
     for(Edge next:graph.get(current.to))if(!visited[next.to])pq.add(next);
    }
   }
   System.out.println("#"+test_case+" "+totalWeight);
  }
 }
}
