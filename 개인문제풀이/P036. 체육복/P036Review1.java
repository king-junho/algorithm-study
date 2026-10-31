import java.util.Arrays;
import java.util.Scanner;
public class P036Review1 {
 private static int maxCount(int[] clothes){
  int count=0;
  for(int i=1;i<clothes.length;i++){
   if(clothes[i]!=0)count++;
   else{
    if(clothes[i-1]==2){count++;clothes[i-1]--;}
    else if(i<clothes.length-1&&clothes[i+1]==2){count++;clothes[i+1]--;}
   }
  }
  return count;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){int n=sc.nextInt(),l=sc.nextInt(),r=sc.nextInt();int[] clothes=new int[n+1];Arrays.fill(clothes,1);for(int i=0;i<l;i++)clothes[sc.nextInt()]--;for(int i=0;i<r;i++)clothes[sc.nextInt()]++;sb.append("#").append(tc).append(" ").append(maxCount(clothes)).append("\n");}System.out.print(sb);
 }
}
