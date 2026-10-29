import java.util.*;
class Edge implements Comparable<Edge>{
 int to,weight;
 public Edge(int to,int weight){this.to=to;this.weight=weight;}
 public int compareTo(Edge o){return Integer.compare(weight,o.weight);}
}
public class P062{
 private static long mst(boolean[] visited,List<List<Edge>> graph){
  PriorityQueue<Edge> pq=new PriorityQueue<>();pq.offer(new Edge(1,0));long totalWeight=0;int cnt=0;
  while(!pq.isEmpty()){
   Edge current=pq.poll();if(visited[current.to])continue;
   visited[current.to]=true;totalWeight+=current.weight;cnt++;
   if(cnt==graph.size()-1)return totalWeight;
   for(Edge next:graph.get(current.to))if(!visited[next.to])pq.offer(next);
  }
  if(cnt!=graph.size()-1)return -1;
  return totalWeight;
 }
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int T=sc.nextInt();
  for(int tc=1;tc<=T;tc++){
   int N=sc.nextInt(),L=sc.nextInt(),M=sc.nextInt();boolean[] visited=new boolean[N+1];List<List<Edge>> graph=new ArrayList<>();
   for(int i=0;i<=N;i++)graph.add(new ArrayList<>());
   for(int i=0;i<L;i++){int from=sc.nextInt(),to=sc.nextInt();graph.get(from).add(new Edge(to,0));graph.get(to).add(new Edge(from,0));}
   for(int i=0;i<M;i++){int from=sc.nextInt(),to=sc.nextInt(),cost=sc.nextInt();graph.get(from).add(new Edge(to,cost));graph.get(to).add(new Edge(from,cost));}
   sb.append("#").append(tc).append(" ").append(mst(visited,graph)).append("\n");
  }
  System.out.print(sb.toString());
 }
}
