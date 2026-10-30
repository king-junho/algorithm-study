import java.util.Scanner;
public class P078 {
 private static int m;
 private static long k;
 private static int backtrack(int[] prices,int depth,long sum,int currentIdx){
  if(depth==m){if(sum==k)return 1;return 0;}
  int count=0;
  for(int i=currentIdx;i<prices.length;i++)count+=backtrack(prices,depth+1,sum+prices[i],i+1);
  return count;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){int n=sc.nextInt();m=sc.nextInt();k=sc.nextLong();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();sb.append("#").append(tc).append(" ").append(backtrack(a,0,0,0)).append("\n");}System.out.print(sb);
 }
}
