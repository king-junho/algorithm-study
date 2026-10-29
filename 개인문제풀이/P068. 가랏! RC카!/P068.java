import java.util.Scanner;
public class P068 {
 public static void main(String[] args)throws Exception{
  Scanner sc=new Scanner(System.in);StringBuilder sb=new StringBuilder();int t=sc.nextInt();
  for(int tc=1;tc<=t;tc++){
   int n=sc.nextInt(),result=0;int speed=0;
   for(int i=0;i<n;i++){
    int type=sc.nextInt();
    if(type==1){speed+=sc.nextInt();}
    else if(type==2){speed=Math.max(0,speed-sc.nextInt());}
    result+=speed;
   }
   sb.append("#").append(tc).append(" ").append(result).append("\n");
  }
  System.out.print(sb.toString());
 }
}
