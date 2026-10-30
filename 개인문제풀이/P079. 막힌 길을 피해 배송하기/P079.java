import java.util.Scanner;
public class P079 {
 // dp[r][c]: 출발점에서 (r,c)까지의 경로 수를 MOD로 나눈 값.
 // 시간 O(N²), 공간 O(N²). 제출 알고리즘을 보존한다.
 private static int dp(int[][] map){
  int n=map.length-1;int[][] dp=new int[n+1][n+1];
  for(int row=1;row<=n;row++)for(int col=1;col<=n;col++){
   if(map[row][col]==0)continue;
   if(row==1){
    if(col==1)dp[row][col]=map[row][col];
    else if(dp[row][col-1]==0)dp[row][col]=0;else dp[row][col]=1;
   }else{
    if(col==1){if(dp[row-1][col]==0)dp[row][col]=0;else dp[row][col]=1;}
    else{if(dp[row-1][col]==0&&dp[row][col-1]==0)dp[row][col]=0;else dp[row][col]=(dp[row-1][col]+dp[row][col-1])%1000000007;}
   }
  }
  return dp[n][n];
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){int n=sc.nextInt();int[][] map=new int[n+1][n+1];for(int i=1;i<=n;i++){String line=sc.next();for(int j=1;j<=n;j++)if(line.charAt(j-1)!='*')map[i][j]=1;}sb.append("#").append(tc).append(" ").append(dp(map)).append("\n");}System.out.print(sb);
 }
}
