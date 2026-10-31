import java.util.Scanner;
public class P047Review1 {
 private static int maxReward(int[][] rewards){
  int[][] dp=new int[rewards.length][rewards[0].length];int result=0;
  dp[0][0]=rewards[0][0];dp[0][1]=rewards[0][1];dp[0][2]=rewards[0][2];
  for(int row=1;row<rewards.length;row++)for(int col=0;col<3;col++)dp[row][col]=rewards[row][col]+Math.max(dp[row-1][(col+1)%3],dp[row-1][(col+2)%3]);
  for(int col=0;col<3;col++)result=Math.max(result,dp[rewards.length-1][col]);
  return result;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){int n=sc.nextInt();int[][] a=new int[n][3];for(int i=0;i<n;i++)for(int j=0;j<3;j++)a[i][j]=sc.nextInt();sb.append("#").append(tc).append(" ").append(maxReward(a)).append("\n");}System.out.print(sb);
 }
}
