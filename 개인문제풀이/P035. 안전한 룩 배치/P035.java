import java.util.Scanner;
public class P035 {
 private static boolean canPlace(int row,int col,String[][] map){if(map[row][col].equals("#"))return false;for(int r=row-1;r>=0;r--)if(map[r][col].equals("L"))return false;return true;}
 private static int backtrack(int row,String[][] map){int n=map.length;if(row==n)return 1;int count=0;for(int col=0;col<n;col++){if(canPlace(row,col,map)){map[row][col]="L";count+=backtrack(row+1,map);map[row][col]=".";}}return count;}
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int T=sc.nextInt();for(int test_case=1;test_case<=T;test_case++){int N=sc.nextInt();sc.nextLine();String[][] map=new String[N][N];for(int i=0;i<N;i++)map[i]=sc.nextLine().split("");System.out.println("#"+test_case+" "+backtrack(0,map));}}
}
