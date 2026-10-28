import java.util.Arrays;
import java.util.Scanner;
public class P057 {
 private static int binary_search(int start,int end,int[] boxes,int capacity){
  int n=boxes.length;
  if(start==end){if(boxes[start]>=capacity)return n-start;return 0;}
  int mid=(start+end)/2;int result=0;
  if(boxes[mid]<capacity){result=Math.max(result,binary_search(mid+1,end,boxes,capacity));}
  else{
   if(mid-1>=0&&boxes[mid-1]>=capacity){result=Math.max(result,binary_search(start,mid-1,boxes,capacity));}
   else{return n-mid;}
  }
  return result;
 }
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int T=sc.nextInt();
  for(int tc=1;tc<=T;tc++){
   int N=sc.nextInt(),Q=sc.nextInt();int[] boxes=new int[N],result=new int[Q];
   for(int i=0;i<N;i++)boxes[i]=sc.nextInt();Arrays.sort(boxes);
   for(int i=0;i<Q;i++)result[i]=binary_search(0,N-1,boxes,sc.nextInt());
   sb.append("#").append(tc).append(" ");
   for(int i=0;i<Q;i++)sb.append(result[i]+" ");
   sb.append("\n");
  }
  System.out.print(sb.toString());
 }
}
