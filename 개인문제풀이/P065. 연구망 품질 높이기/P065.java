import java.util.*;
class Edge implements Comparable<Edge>{
 int to;long cost;
 public Edge(int to,int cost){this.to=to;this.cost=cost;}
 public int compareTo(Edge o){return Long.compare(o.cost,this.cost);}
}
public class P065{
 private static long mst(List<List<Edge>> graph,boolean[] visited){
  PriorityQueue<Edge> pq=new PriorityQueue<>();pq.offer(new Edge(1,0));long totalCost=0;int connectCount=0;
  while(!pq.isEmpty()){
   Edge current=pq.poll();if(visited[current.to])continue;
   visited[current.to]=true;totalCost+=current.cost;connectCount++;
   if(connectCount==graph.size()-1)return totalCost;
   for(Edge next:graph.get(current.to))if(!visited[next.to])pq.offer(next);
  }
  if(connectCount!=graph.size()-1)return -1;
  return totalCost;
 }
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){
   int n=sc.nextInt(),m=sc.nextInt();List<List<Edge>> graph=new ArrayList<>();boolean[] visited=new boolean[n+1];
   for(int i=0;i<=n;i++)graph.add(new ArrayList<>());
   for(int i=0;i<m;i++){int from=sc.nextInt(),to=sc.nextInt(),cost=sc.nextInt();graph.get(from).add(new Edge(to,cost));graph.get(to).add(new Edge(from,cost));}
   sb.append("#").append(tc).append(" ").append(mst(graph,visited)).append("\n");
  }
  System.out.print(sb.toString());
 }
}
