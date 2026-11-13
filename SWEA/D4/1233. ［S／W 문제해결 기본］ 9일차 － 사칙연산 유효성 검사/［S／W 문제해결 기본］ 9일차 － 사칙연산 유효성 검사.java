import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Solution {
  private static int isCalculate(String[] lines){
    for(String line : lines){
      String[] input = line.split(" ");
      char node = input[1].charAt(0);

      if(input.length==4){ //자식이 있을 때
        if(node=='+' || node=='-' ||  node=='*' || node=='/'){
          continue;
        }else{
          return 0;
        }
      }else{// 자식이 없을 때
        if(node=='+' || node=='-' ||  node=='*' || node=='/'){
          return 0;
        }
      }
    }
    return 1;
  }
  public static void main(String[] args) throws Exception {
    /*
    1. 15:17 시작 ~ 15:40 종 료
    자식이 있으면 문자열을 가져야 하고
    자식이 없으면 숫자만 가져야 한다.

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(N)
    공간 복잡도 : O(N)

    3. 자료구조
    String[] lines
    */

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    for(int test_case=1; test_case<=10; test_case++){
      int n = sc.nextInt();

      String[] lines = new String[n];
      sc.nextLine();
      for(int i=0; i<n; i++){
        lines[i] = sc.nextLine();

      }


      sb.append("#").append(test_case).append(" ").append(isCalculate(lines)).append("\n");
    }
    System.out.print(sb.toString());

  }

}

