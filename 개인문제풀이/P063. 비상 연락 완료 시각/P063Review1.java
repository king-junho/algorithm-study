import java.util.*;
class P063ReviewNode implements Comparable<P063ReviewNode>{
 int index; long weight;
 P063ReviewNode(int index,long weight){this.index=index;this.weight=weight;}
 public int compareTo(P063ReviewNode o){return Long.compare(weight,o.weight);}
}
public class P063Review1 {
 private static long dijkstra(List<List<P063ReviewNode>> graph,long[] dist,int start){
  long result=0;PriorityQueue<P063ReviewNode> pq=new PriorityQueue<>();pq.add(new P063ReviewNode(start,0));dist[start]=0;
  while(!pq.isEmpty()){
   P063ReviewNode current=pq.poll();
   if(current.weight>dist[current.index])continue;
   for(P063ReviewNode next:graph.get(current.index)){
    if(dist[current.index]+next.weight<dist[next.index]){
     dist[next.index]=dist[current.index]+next.weight;pq.add(new P063ReviewNode(next.index,dist[current.index]+next.weight));
    }
   }
  }
  for(int i=1;i<dist.length;i++){if(dist[i]==Long.MAX_VALUE)return -1;result=Math.max(result,dist[i]);}
  return result;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){int n=sc.nextInt(),m=sc.nextInt(),s=sc.nextInt();List<List<P063ReviewNode>> g=new ArrayList<>();long[] d=new long[n+1];Arrays.fill(d,Long.MAX_VALUE);for(int i=0;i<=n;i++)g.add(new ArrayList<>());for(int i=0;i<m;i++)g.get(sc.nextInt()).add(new P063ReviewNode(sc.nextInt(),sc.nextInt()));sb.append("#").append(tc).append(" ").append(dijkstra(g,d,s)).append("\n");}System.out.print(sb);
 }
}
