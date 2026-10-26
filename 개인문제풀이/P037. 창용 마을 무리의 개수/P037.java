import java.util.*;
class P037 {
 private static int bfs(List[] graph,int start,boolean[] visited){int result=0;for(int i=start;i<graph.length;i++){if(visited[i])continue;Deque<Integer> queue=new ArrayDeque<>();queue.add(i);visited[i]=true;while(!queue.isEmpty()){int current=queue.poll();for(int j=0;j<graph[current].size();j++){int next=(int)graph[current].get(j);if(!visited[next]){queue.add(next);visited[next]=true;}}}result++;}return result;}
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int T=sc.nextInt();for(int tc=1;tc<=T;tc++){int N=sc.nextInt(),M=sc.nextInt();List[] graph=new ArrayList[N+1];boolean[] visited=new boolean[N+1];for(int i=1;i<=N;i++)graph[i]=new ArrayList<>();for(int i=0;i<M;i++){int idx=sc.nextInt(),value=sc.nextInt();graph[idx].add(value);graph[value].add(idx);}System.out.println("#"+tc+" "+bfs(graph,1,visited));}}
}
