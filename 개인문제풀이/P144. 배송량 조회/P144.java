import java.awt.*;
import java.util.Comparator;
import java.util.Scanner;

class Command{
  int start;
  int end;

  public Command(int start, int end){
    this.start = start;
    this.end = end;
  }
}

public class P144 {
  private static void sumDelivery(int[] numbers, Command[] commands, StringBuilder sb){
    long dp[] = new long[numbers.length];
    dp[0] = numbers[0];
    for(int i=1; i<numbers.length; i++){
      dp[i] = dp[i-1]+numbers[i];
    }

    for(int i=0; i<commands.length; i++){
      int start = commands[i].start;
      int end = commands[i].end;
      long result = start==1 ? dp[end-1] : dp[end-1]-dp[start-2];
      sb.append(result).append(" ");
    }
    sb.append("\n");
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 11:32 시작 ~ 11:46 종 료
    dp 누적합 이용
    dp 배열에 저장 1일부터 N일까지의 누적합
    dp[조회 마지막 일] - dp[조회 시작일 -1]로 조회량 계산

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N+Q) :
    공간 복잡도 : O(N+Q) :

    3. 자료구조
    int[] numbers
    Command[] commands
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();
      int q = sc.nextInt();
      int[] numbers = new int[n];
      Command[] commands = new Command[q];

      for(int i=0; i<n; i++){
        numbers[i] = sc.nextInt();
      }
      for(int i=0; i<q; i++){
        int start = sc.nextInt();
        int end = sc.nextInt();
        commands[i] = new Command(start, end);
      }

      sb.append("#").append(test_case).append(" ");
      sumDelivery(numbers,commands,sb);
    }
    System.out.print(sb.toString());

  }
}

