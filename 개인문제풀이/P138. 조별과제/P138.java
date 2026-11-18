import java.util.Scanner;

public class P138 {
  public static void main(String[] args) throws Exception {
    /*
    1. 12:40 시작 ~ 12:43 종 료
    greedy? 3명 이상의 최대 조 개수는 n명을 3으로 나눈 몫과 같다.

    2. 시간 & 공간 복잡도
    시간 복잡도 : O(1) :
    공간 복잡도 : O(1) :

    3. 자료구조
    */
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int t = sc.nextInt();

    for(int test_case=1; test_case<=t; test_case++) {
      int n = sc.nextInt();

      sb.append("#").append(test_case).append(" ").append(n/3).append("\n");
    }
    System.out.print(sb.toString());

  }
}

