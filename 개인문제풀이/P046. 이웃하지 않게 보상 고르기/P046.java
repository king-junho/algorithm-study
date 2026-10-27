import java.util.Arrays;
import java.util.Scanner;
public class P046 {
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int T=sc.nextInt();for(int tc=1;tc<=T;tc++){int N=sc.nextInt();int[] dp=new int[N];int result;for(int i=0;i<N;i++){dp[i]=sc.nextInt();if(i>1)dp[i]=Math.max(dp[i-1],dp[i]+Arrays.stream(Arrays.copyOfRange(dp,0,i-1)).max().getAsInt());}System.out.println("#"+tc+" "+Arrays.stream(dp).max().getAsInt());}}
}
