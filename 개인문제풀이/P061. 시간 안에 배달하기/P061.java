import java.util.*;
class Node implements Comparable<Node>{
 int index;long time;
 public Node(int index,long time){this.index=index;this.time=time;}
 public int compareTo(Node o){return Long.compare(this.time,o.time);}
}
public class P061 {
 private static void dijkstra(List<List<Node>> graph,int start,long[] times){
  PriorityQueue<Node> pq=new PriorityQueue<>();pq.offer(new Node(start,0));times[start]=0;
  while(!pq.isEmpty()){
   Node current=pq.poll();int now=current.index;long time=current.time;
   if(times[now]<time)continue;
   for(Node next:graph.get(now)){
    long nextTime=time+next.time;
    if(nextTime<times[next.index]){times[next.index]=nextTime;pq.offer(new Node(next.index,nextTime));}
   }
  }
 }
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){
   int n=sc.nextInt(),m=sc.nextInt(),s=sc.nextInt();long k=sc.nextLong();
   List<List<Node>> graph=new ArrayList<>();long[] times=new long[n+1];
   for(int i=0;i<=n;i++){graph.add(new ArrayList<>());times[i]=Long.MAX_VALUE;}
   for(int i=0;i<m;i++){
    int from=sc.nextInt(),to=sc.nextInt(),time=sc.nextInt();graph.get(from).add(new Node(to,time));graph.get(to).add(new Node(from,time));
   }
   dijkstra(graph,s,times);int result=0;
   for(int i=1;i<=n;i++)if(times[i]<=k)result++;
   sb.append("#").append(tc).append(" ").append(result).append("\n");
  }
  System.out.print(sb.toString());
 }
}
