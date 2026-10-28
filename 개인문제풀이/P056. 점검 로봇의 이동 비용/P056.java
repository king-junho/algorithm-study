import java.util.Scanner;
public class P056 {
 private static long minValue(int[] spots){
  int n=spots.length;
  if(n<=2)return spots[n-1];
  long[] dp=new long[n];dp[0]=spots[0];dp[1]=spots[1];
  for(int i=2;i<n;i++)dp[i]=spots[i]+Math.min(dp[i-1],dp[i-2]);
  return dp[n-1];
 }
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int T=sc.nextInt();
  for(int tc=1;tc<=T;tc++){
   int N=sc.nextInt();int[] spots=new int[N];
   for(int i=0;i<N;i++)spots[i]=sc.nextInt();
   sb.append("#").append(tc).append(" ").append(minValue(spots)).append("\n");
  }
  System.out.print(sb.toString());
 }
}
