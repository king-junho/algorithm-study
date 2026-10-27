import java.util.Scanner;
public class P046 {
 static int maxReward(int[] rewards){int n=rewards.length;int[] dp=new int[n];dp[0]=rewards[0];if(n==1)return dp[0];dp[1]=Math.max(rewards[0],rewards[1]);for(int i=2;i<n;i++)dp[i]=Math.max(dp[i-1],dp[i-2]+rewards[i]);return dp[n-1];}
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int T=sc.nextInt();for(int tc=1;tc<=T;tc++){int n=sc.nextInt();int[] rewards=new int[n];for(int i=0;i<n;i++)rewards[i]=sc.nextInt();System.out.println("#"+tc+" "+maxReward(rewards));}}
}
