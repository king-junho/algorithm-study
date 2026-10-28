import java.util.*;
class Node implements Comparable<Node>{
 int index,time;
 public Node(int index,int time){this.index=index;this.time=time;}
 public int compareTo(Node o){return Integer.compare(this.time,o.time);}
}
public class P060 {
 private static int n,m,s;
 private static int[] times;
 private static List<List<Node>> graph;
 private static void dijkstra(){
  PriorityQueue<Node> pq=new PriorityQueue<>();pq.offer(new Node(s,0));times[s]=0;
  while(!pq.isEmpty()){
   Node current=pq.poll();int now=current.index,time=current.time;
   if(times[now]<time)continue;
   for(Node next:graph.get(now)){
    int nextTime=time+next.time;
    if(nextTime<times[next.index]){times[next.index]=nextTime;pq.offer(new Node(next.index,nextTime));}
   }
  }
 }
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int T=sc.nextInt();
  for(int tc=1;tc<=T;tc++){
   n=sc.nextInt();m=sc.nextInt();s=sc.nextInt();times=new int[n+1];Arrays.fill(times,Integer.MAX_VALUE);
   graph=new ArrayList<>();for(int i=0;i<=n;i++)graph.add(new ArrayList<>());
   for(int i=0;i<m;i++){int from=sc.nextInt(),to=sc.nextInt(),time=sc.nextInt();graph.get(from).add(new Node(to,time));}
   dijkstra();sb.append("#").append(tc).append(" ");
   for(int i=1;i<=n;i++)sb.append(times[i]==Integer.MAX_VALUE?-1:times[i]).append(" ");
   sb.append("\n");
  }
  System.out.print(sb.toString());
 }
}
