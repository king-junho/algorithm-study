import java.util.Arrays;
import java.util.Scanner;
public class P067Review1 {
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){
   int n=sc.nextInt();int[][] triangle=new int[n][n];triangle[0][0]=1;
   for(int row=1;row<n;row++){
    triangle[row][0]=1;triangle[row][row]=1;
    for(int col=1;col<row;col++)triangle[row][col]=triangle[row-1][col-1]+triangle[row-1][col];
   }
   sb.append("#").append(tc).append("\n");
   for(int row=0;row<n;row++){
    for(int col=0;col<=row;col++)sb.append(triangle[row][col]+" ");
    sb.append("\n");
   }
  }
  System.out.print(sb.toString());
 }
}
