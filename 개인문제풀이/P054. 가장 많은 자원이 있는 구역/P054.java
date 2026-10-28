import java.util.Scanner;
public class P054 {
 private static final int[] dr={1,-1,0,0};
 private static final int[] dc={0,0,-1,1};
 private static int dfs(int row,int col,int[][] map,boolean[][] visited){
  int rows=map.length,cols=map[0].length;
  int sum=map[row][col];
  for(int i=0;i<4;i++){
   int nr=row+dr[i],nc=col+dc[i];
   if(nr<0||nr>=rows||nc<0||nc>=cols)continue;
   if(map[nr][nc]!=0&&!visited[nr][nc]){
    visited[nr][nc]=true;
    sum+=dfs(nr,nc,map,visited);
   }
  }
  return sum;
 }
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);int T=sc.nextInt();
  for(int test_case=1;test_case<=T;test_case++){
   int rows=sc.nextInt(),cols=sc.nextInt();
   boolean[][] visited=new boolean[rows][cols];int[][] map=new int[rows][cols];int result=0;
   for(int row=0;row<rows;row++)for(int col=0;col<cols;col++)map[row][col]=sc.nextInt();
   for(int row=0;row<rows;row++)for(int col=0;col<cols;col++){
    if(map[row][col]!=0&&!visited[row][col]){
     visited[row][col]=true;
     result=Math.max(result,dfs(row,col,map,visited));
    }
   }
   System.out.println("#"+test_case+" "+result);
  }
 }
}
