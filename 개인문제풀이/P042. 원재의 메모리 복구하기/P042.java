import java.util.Scanner;
public class P042 {
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int T=sc.nextInt();for(int tc=1;tc<=T;tc++){String line=sc.next();int length=line.length();String recover="0".repeat(length);int result=0;StringBuilder sb;for(int i=0;i<length;i++){if(line.equals(recover))break;sb=new StringBuilder();if(recover.charAt(i)!=line.charAt(i)){sb.append(recover.substring(0,i));for(int j=0;j<length-i;j++)sb.append(line.charAt(i));recover=sb.toString();result++;}}System.out.println("#"+tc+" "+result);}}
}
