import java.util.PriorityQueue;
import java.util.Scanner;
class Event implements Comparable<Event> {
 int startTime,endTime;
 Event(int startTime,int endTime){this.startTime=startTime;this.endTime=endTime;}
 public int compareTo(Event o){return Integer.compare(this.endTime,o.endTime);}
}
public class P055 {
 private static int greedy(PriorityQueue<Event> pq){
  int result=0,endTime=0;
  while(!pq.isEmpty()){
   Event current=pq.poll();
   if(endTime>current.startTime)continue;
   endTime=current.endTime;result++;
  }
  return result;
 }
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);int T=sc.nextInt();
  for(int tc=1;tc<=T;tc++){
   int N=sc.nextInt();PriorityQueue<Event> pq=new PriorityQueue<>();
   for(int i=0;i<N;i++)pq.add(new Event(sc.nextInt(),sc.nextInt()));
   System.out.println("#"+tc+" "+greedy(pq));
  }
 }
}
