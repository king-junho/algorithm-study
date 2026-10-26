import java.util.Scanner;
public class P043 {
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int T=sc.nextInt();for(int tc=1;tc<=T;tc++){int result=0;int N=sc.nextInt();if(N<3){System.out.println("#"+tc+" "+N);continue;}int[] dp=new int[N+1];dp[1]=1;dp[2]=2;for(int i=3;i<=N;i++)dp[i]=dp[i-1]+dp[i-2];System.out.println("#"+tc+" "+dp[N]);}}
}
