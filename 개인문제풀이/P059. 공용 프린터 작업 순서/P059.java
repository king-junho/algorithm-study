import java.util.Arrays;
import java.util.Scanner;
public class P059 {
 private static long minValue(int[] prints){
  int n=prints.length;long[] dp=new long[n];dp[0]=prints[0];
  for(int i=1;i<n;i++)dp[i]=dp[i-1]+prints[i];
  return Arrays.stream(dp).sum();
 }
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int T=sc.nextInt();
  for(int tc=1;tc<=T;tc++){
   int N=sc.nextInt();int[] prints=new int[N];for(int i=0;i<N;i++)prints[i]=sc.nextInt();
   Arrays.sort(prints);sb.append("#").append(tc).append(" ").append(minValue(prints)).append("\n");
  }
  System.out.print(sb.toString());
 }
}
