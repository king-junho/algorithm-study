import java.util.*;
class Edge implements Comparable<Edge>{
 int to,weight;
 Edge(int to,int weight){this.to=to;this.weight=weight;}
 public int compareTo(Edge o){return Integer.compare(weight,o.weight);}
}
public class P058{
 private static long msp(List<List<Edge>> graph,boolean[] visited){
  long result=0;PriorityQueue<Edge> pq=new PriorityQueue<>();pq.offer(new Edge(1,0));int connectCount=0;
  while(!pq.isEmpty()){
   Edge current=pq.poll();
   if(!visited[current.to]){
    visited[current.to]=true;result+=current.weight;connectCount++;
    for(Edge next:graph.get(current.to))if(!visited[next.to])pq.offer(next);
   }
  }
  if(connectCount==graph.size()-1)return result;
  return -1;
 }
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int T=sc.nextInt();
  for(int tc=1;tc<=T;tc++){
   int N=sc.nextInt(),M=sc.nextInt();List<List<Edge>> graph=new ArrayList<>();boolean[] visited=new boolean[N+1];long totalWeight=0;
   for(int i=0;i<=N;i++)graph.add(new ArrayList<>());
   for(int i=0;i<M;i++){
    int from=sc.nextInt(),to=sc.nextInt(),weight=sc.nextInt();totalWeight+=weight;
    graph.get(from).add(new Edge(to,weight));graph.get(to).add(new Edge(from,weight));
   }
   long result=msp(graph,visited);result=result!=-1?totalWeight-result:-1;
   sb.append("#").append(tc).append(" ").append(result).append("\n");
  }
  System.out.print(sb.toString());
 }
}
