import java.util.*;
class P062ReviewEdge implements Comparable<P062ReviewEdge>{
 int to,cost;
 P062ReviewEdge(int to,int cost){this.to=to;this.cost=cost;}
 public int compareTo(P062ReviewEdge o){return Integer.compare(cost,o.cost);}
}
public class P062Review1 {
 private static long mst(List<List<P062ReviewEdge>> graph,boolean[] visited){
  int n=graph.size()-1;long result=0;int connectCount=0;PriorityQueue<P062ReviewEdge> pq=new PriorityQueue<>();pq.offer(new P062ReviewEdge(1,0));
  while(!pq.isEmpty()){
   P062ReviewEdge current=pq.poll();if(visited[current.to])continue;
   visited[current.to]=true;result+=current.cost;connectCount++;
   if(connectCount==n)return result;
   for(P062ReviewEdge next:graph.get(current.to))if(!visited[next.to])pq.offer(next);
  }
  return connectCount==n?result:-1;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){
   int n=sc.nextInt(),l=sc.nextInt(),m=sc.nextInt();List<List<P062ReviewEdge>> g=new ArrayList<>();boolean[] visited=new boolean[n+1];for(int i=0;i<=n;i++)g.add(new ArrayList<>());
   for(int i=0;i<l;i++){int a=sc.nextInt(),b=sc.nextInt();g.get(a).add(new P062ReviewEdge(b,0));g.get(b).add(new P062ReviewEdge(a,0));}
   for(int i=0;i<m;i++){int a=sc.nextInt(),b=sc.nextInt(),w=sc.nextInt();g.get(a).add(new P062ReviewEdge(b,w));g.get(b).add(new P062ReviewEdge(a,w));}
   sb.append("#").append(tc).append(" ").append(mst(g,visited)).append("\n");
  }System.out.print(sb);
 }
}
