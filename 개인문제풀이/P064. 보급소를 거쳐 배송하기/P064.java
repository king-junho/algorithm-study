import java.util.*;
class Node implements Comparable<Node>{
 int index;long cost;
 public Node(int index,long cost){this.index=index;this.cost=cost;}
 public int compareTo(Node o){return Long.compare(cost,o.cost);}
}
public class P064 {
 private static final long INF=Long.MAX_VALUE;
 private static long dijkstra(List<List<Node>> graph,int start,int end){
  long[] dist=new long[graph.size()];Arrays.fill(dist,INF);
  PriorityQueue<Node> pq=new PriorityQueue<>();pq.offer(new Node(start,0));dist[start]=0;
  while(!pq.isEmpty()){
   Node current=pq.poll();int now=current.index;long cost=current.cost;
   if(cost>dist[now])continue;
   for(Node next:graph.get(now)){
    long nextCost=cost+next.cost;
    if(nextCost>=dist[next.index])continue;
    pq.offer(new Node(next.index,nextCost));dist[next.index]=nextCost;
   }
  }
  return dist[end]!=INF?dist[end]:-1;
 }
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){
   int n=sc.nextInt(),m=sc.nextInt(),s=sc.nextInt(),p=sc.nextInt(),d=sc.nextInt();
   List<List<Node>> graph=new ArrayList<>();long[] dist=new long[n+1];
   for(int i=0;i<=n;i++){graph.add(new ArrayList<>());dist[i]=INF;}
   for(int i=0;i<m;i++){
    int from=sc.nextInt(),to=sc.nextInt(),cost=sc.nextInt();
    graph.get(from).add(new Node(to,cost));graph.get(to).add(new Node(from,cost));
   }
   long first=dijkstra(graph,s,p);
   long result;
   if(first!=-1){long second=dijkstra(graph,p,d);result=second!=-1?first+second:-1;}else result=-1;
   sb.append("#").append(tc).append(" ").append(result).append("\n");
  }
  System.out.print(sb.toString());
 }
}
