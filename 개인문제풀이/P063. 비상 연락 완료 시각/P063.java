import java.util.*;
class Node implements Comparable<Node>{
 int index;long weight;
 public Node(int index,long weight){this.index=index;this.weight=weight;}
 public int compareTo(Node o){return Long.compare(this.weight,o.weight);}
}
public class P063{
 private static final long INF=Long.MAX_VALUE;
 private static long dijkstra(List<List<Node>> graph,long[] times,int start){
  PriorityQueue<Node> pq=new PriorityQueue<>();pq.offer(new Node(start,0));times[start]=0;
  while(!pq.isEmpty()){
   Node current=pq.poll();int now=current.index;long cost=current.weight;
   if(cost>times[now])continue;
   for(Node next:graph.get(now)){
    long nextCost=cost+next.weight;
    if(nextCost<times[next.index]){times[next.index]=nextCost;pq.offer(new Node(next.index,nextCost));}
   }
  }
  long result=0;
  for(int i=1;i<times.length;i++){
   if(times[i]==INF)return -1;
   result=Math.max(result,times[i]);
  }
  return result;
 }
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int T=sc.nextInt();
  for(int tc=1;tc<=T;tc++){
   int n=sc.nextInt(),m=sc.nextInt(),s=sc.nextInt();List<List<Node>> graph=new ArrayList<>();long[] times=new long[n+1];
   for(int i=0;i<=n;i++){graph.add(new ArrayList<>());times[i]=INF;}
   for(int i=0;i<m;i++){int from=sc.nextInt(),to=sc.nextInt(),cost=sc.nextInt();graph.get(from).add(new Node(to,cost));}
   sb.append("#").append(tc).append(" ").append(dijkstra(graph,times,s)).append("\n");
  }
  System.out.print(sb.toString());
 }
}
