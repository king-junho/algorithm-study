import java.util.Scanner;
public class P040 {
 private static int hit(int[][] map,int row,int col,int m){int result=0;for(int i=row;i<row+m;i++)for(int j=col;j<col+m;j++)result+=map[i][j];return result;}
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int T=sc.nextInt();for(int tc=1;tc<=T;tc++){int N=sc.nextInt(),M=sc.nextInt();int result=Integer.MIN_VALUE;int[][] map=new int[N][N];for(int r=0;r<N;r++)for(int c=0;c<N;c++)map[r][c]=sc.nextInt();for(int r=0;r<N-M+1;r++)for(int c=0;c<N-M+1;c++)result=Math.max(result,hit(map,r,c,M));System.out.println("#"+tc+" "+result);}}
}
