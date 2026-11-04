import java.util.HashMap;
import java.util.Scanner;
public class P076Review1 {
 private static int minSection(int[] numbers,int capacity){
  int result=0;HashMap<Integer,Integer> map=new HashMap<>();int left=0;
  for(int right=0;right<numbers.length;right++){
   map.put(numbers[right],1+map.getOrDefault(numbers[right],0));
   while(map.size()>capacity){
    Integer previous=map.put(numbers[left],map.get(numbers[left])-1);
    if(previous==1)map.remove(numbers[left]);
    left++;
   }
   result=Math.max(result,right-left+1);
  }
  return result;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){int n=sc.nextInt(),k=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();sb.append("#").append(tc).append(" ").append(minSection(a,k)).append("\n");}System.out.print(sb);
 }
}
