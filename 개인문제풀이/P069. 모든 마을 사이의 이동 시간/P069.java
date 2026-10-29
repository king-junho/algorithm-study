import java.util.Arrays;
import java.util.Scanner;
public class P069 {
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){
   int n=sc.nextInt(),m=sc.nextInt();int[][] map=new int[n+1][n+1];
   for(int i=0;i<=n;i++){Arrays.fill(map[i],Integer.MAX_VALUE);map[i][i]=0;}
   for(int i=0;i<m;i++){int from=sc.nextInt(),to=sc.nextInt(),cost=sc.nextInt();map[from][to]=Math.min(map[from][to],cost);}
   for(int k=1;k<=n;k++)for(int s=1;s<=n;s++)for(int e=1;e<=n;e++){
    if(map[s][k]!=Integer.MAX_VALUE&&map[k][e]!=Integer.MAX_VALUE){
     if(map[s][e]>map[s][k]+map[k][e])map[s][e]=map[s][k]+map[k][e];
    }
   }
   sb.append("#").append(tc).append("\n");
   for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++)sb.append(map[i][j]!=Integer.MAX_VALUE?map[i][j]:-1).append(" ");
    sb.append("\n");
   }
  }
  System.out.print(sb.toString());
 }
}
