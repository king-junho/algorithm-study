import java.util.Arrays;
import java.util.Scanner;

public class P146 {
  private static void minPeriod(int[] numbers, long  k, StringBuilder sb){
    int left=0;
    int start=0;
    int period=Integer.MAX_VALUE;
    long sum=0;
    for(int right=0; right<numbers.length; right++){
      sum+=numbers[right];

      while(sum>=k){
        int length = right-left+1;
        if(period>length){
          start=left;
          period=length;
        }
        sum-=numbers[left];
        left++;
      }
    }
    if(period==Integer.MAX_VALUE){
      sb.append("-1").append("\n");
    }else{
      sb.append(start+1).append(" ").append(period).append("\n");
    }
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 10:35 시작 ~ 11:00 종 료
    투포인터 문제 활용
    int result=Integer.maxValue;

    for(int right=0; right<n; right++){
      sum+=right값
      while(sum>=k){
        result=Math.min(result,right-left+1)
        sum-=left 값;
        left++;
      }
    }
    if(result==Math.maxValue){
      sb.append("-1")
    }else{
      sb.append(시작일).( ).(기간).(줄바꿈)
    }


    2. 시간 & 공간 복잡도
    시간 복잡도 : O(NQ) :
    공간 복잡도 : O(N+Q) :

    3. 자료구조
    Box[] boxes
    PriorityQueue<Order>
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++){
      int n = sc.nextInt();
      long k =sc.nextLong();
      int[] numbers = new int[n];

      for(int i=0; i<n; i++){
        numbers[i] = sc.nextInt();
      }


      sb.append("#").append(test_case).append(" ");
      minPeriod(numbers,k,sb);
    }
    System.out.print(sb.toString());
  }
}

