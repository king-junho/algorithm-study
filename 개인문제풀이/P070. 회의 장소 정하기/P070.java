import java.util.Arrays;
import java.util.Scanner;
public class P070 {
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){
   int n=sc.nextInt(),m=sc.nextInt();long[][] map=new long[n+1][n+1];
   for(int i=1;i<=n;i++){Arrays.fill(map[i],Long.MAX_VALUE);map[i][i]=0;}
   for(int i=0;i<m;i++){int from=sc.nextInt(),to=sc.nextInt(),cost=sc.nextInt();map[from][to]=Math.min(map[from][to],cost);map[to][from]=Math.min(map[to][from],cost);}
   for(int via=1;via<=n;via++)for(int from=1;from<=n;from++){
    if(map[from][via]==Long.MAX_VALUE)continue;
    for(int to=1;to<=n;to++){
     if(map[via][to]==Long.MAX_VALUE)continue;
     if(map[from][to]>map[from][via]+map[via][to]){map[from][to]=map[from][via]+map[via][to];map[to][from]=map[from][via]+map[via][to];}
    }
   }
   long minValue=Long.MAX_VALUE;int country=0;sb.append("#").append(tc).append(" ");
   for(int i=1;i<=n;i++){
    long sum=0;
    for(int j=1;j<=n;j++){if(map[i][j]==Long.MAX_VALUE){sum=Long.MAX_VALUE;break;}else sum+=map[i][j];}
    if(minValue>sum){minValue=sum;country=i;}
   }
   if(minValue==Long.MAX_VALUE)sb.append(-1).append("\n");else sb.append(country).append(" ").append(minValue).append("\n");
  }
  System.out.print(sb.toString());
 }
}
