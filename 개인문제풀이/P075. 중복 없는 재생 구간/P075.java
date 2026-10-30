import java.util.Hashtable;
import java.util.Scanner;
public class P075 {
 public static int twopoint(int[] numbers){
  Hashtable<Integer,Integer> table=new Hashtable<>();
  int left=0;int right;int n=numbers.length;int result=0;
  for(right=0;right<n;right++){
   if(table.containsKey(numbers[right]))left=Math.max(left,table.get(numbers[right])+1);
   table.put(numbers[right],right);result=Math.max(result,right-left+1);
  }
  return result;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){int n=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();sb.append("#").append(tc).append(" ").append(twopoint(a)).append("\n");}System.out.print(sb);
 }
}
