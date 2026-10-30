import java.util.Scanner;
public class P072 {
 private static int twopoint(int[] numbers,int target){
  int n=numbers.length,count=0,left=0,right=n-1;
  while(left<right){
   int sum;
   sum=numbers[left]+numbers[right];
   if(sum==target){count++;left++;right--;}
   else if(sum>target)right--;else left++;
  }
  return count;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){int n=sc.nextInt(),k=sc.nextInt();int[] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();sb.append("#").append(tc).append(" ").append(twopoint(a,k)).append("\n");}System.out.print(sb);
 }
}
