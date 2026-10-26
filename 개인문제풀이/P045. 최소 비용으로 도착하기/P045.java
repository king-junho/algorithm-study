import java.util.Scanner;
public class P045 {
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int T=sc.nextInt();for(int tc=1;tc<=T;tc++){int row=sc.nextInt(),col=sc.nextInt();int[][] map=new int[row][col],dp=new int[row][col];for(int r=0;r<row;r++)for(int c=0;c<col;c++)map[r][c]=sc.nextInt();dp[0][0]=map[0][0];for(int r=0;r<row;r++)for(int c=0;c<col;c++){if(r==0&&c!=0)dp[r][c]=map[r][c]+dp[r][c-1];if(c==0&&r!=0)dp[r][c]=map[r][c]+dp[r-1][c];else if(c>0&&r>0)dp[r][c]=map[r][c]+Math.min(dp[r][c-1],dp[r-1][c]);}System.out.println("#"+tc+" "+dp[row-1][col-1]);}}
}
