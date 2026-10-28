import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class P053 {
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);
  int T=sc.nextInt();
  for(int test_case=1;test_case<=T;test_case++){
   StringBuilder sb=new StringBuilder();
   int N=sc.nextInt();long K=sc.nextLong();int[] numbers=new int[N];int result=Integer.MAX_VALUE;
   for(int i=0;i<N;i++)numbers[i]=sc.nextInt();
   int start=0,end=0;
   long totalValue=numbers[start];
   while(start<N){
    if(totalValue>=K){
     result=Math.min(result,end-start+1);
     totalValue-=numbers[start];start++;
    }else{
     if(end>=N-1)break;
     end++;totalValue+=numbers[end];
    }
   }
   if(result==Integer.MAX_VALUE)result=0;
   sb.append("#").append(test_case).append(" ").append(result);System.out.println(sb.toString());
  }
 }
}
