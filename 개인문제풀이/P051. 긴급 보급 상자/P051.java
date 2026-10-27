import java.util.*;
class Vertex {
 int weight, important;
 public Vertex(int weight,int important){this.weight=weight;this.important=important;}
}
public class P051 {
 private static long W;
 private static int N;
 private static List<Vertex> supplies=new ArrayList<>();
 private static int backtrack(int index,long currentWeight,int currentValue){
  if(currentWeight>W)return 0;
  int best=currentValue;
  for(int i=index;i<N;i++){
   int candidate=backtrack(i+1,currentWeight+supplies.get(i).weight,currentValue+supplies.get(i).important);
   best=Math.max(best,candidate);
  }
  return best;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);int T=sc.nextInt();
  for(int test_case=1;test_case<=T;test_case++){
   N=sc.nextInt();W=sc.nextLong();supplies=new ArrayList<>();
   for(int i=0;i<N;i++)supplies.add(new Vertex(sc.nextInt(),sc.nextInt()));
   System.out.println("#"+test_case+" "+backtrack(0,0,0));
  }
 }
}
